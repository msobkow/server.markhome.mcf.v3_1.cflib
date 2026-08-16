/*
 *	Mark's Code Fractal CFLib DbUtil 3.1 Common Library
 *
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *
 *	CFLib DbUtil provides the essential database types and utilities for Code Fractal applications.
 *
 *	These files are part of Mark's Code Fractal CFLib DbUtil.
 *
 *	Mark's Code Fractal CFLib DbUtil is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU Library General Public License,
 *	Version 3 or later with static linking exception.
 *
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the LGPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-LGPLv3-compatibly licensed code.  That said,
 *	code which does not rely on this library is free to specify whatever license its
 *	authors decide to use. Mark Sobkow specifically rejects the infectious nature of
 *	the LGPLv3, and considers the mere act of including LGPLv3 modules in an
 *	executable to be perfectly reasonable given tools like modern Java's single-jar
 *	deployment options.
 *
 *	Mark's Code Fractal CFLib DbUtil is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU Library General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	Mark's Code Fractal CFLib DbUtil is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU Library General Public License for more details.
 *
 *	You should have received a copy of the GNU Library General Public License
 *	along with Mark's Code Fractal CFLib DbUtil.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *
 *	If you wish to modify and use this code without publishing your changes in order to
 *	tie it to proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.mcf.v3_1.cflib.keyhash;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author msobkow
 */
public class CFLibKeyHash224 extends CFLibKeyHashBase<CFLibKeyHash224> implements ICFLibKeyHash224, Serializable {
  static final long serialVersionUID = 202608160342L;
  protected byte[] bytes;

  static public int compareOrdered(ICFLibKeyHash224 h1, ICFLibKeyHash224 h2) {
    if (h1 == null) {
      if (h2 == null) {
        return 0;
      }
      else {
        return -1;
      }
    }
    else {
      if (h2 == null) {
        return 1;
      }
      else {
        for (int i = 0; i < HASH_LENGTH; i++) {
          int v1 = h1.getBytes()[i] + 256;
          int v2 = h2.getBytes()[i] + 256;
          if (v1 < v2) return -1;
          if (v1 > v2) return 1;
        }
      }
    }
    return 0;
  }

  @Override
  public int getHashLength() {
    return HASH_LENGTH;
  }

  @Override
  public int getHashLengthString() {
    return HASH_LENGTH_STRING;
  }

  @Override
  public String getHashAlgo() {
    return HASH_ALGO;
  }

  static MessageDigest[] m = null;
  @Override
  protected MessageDigest[] getM() {
    return m;
  }

  @Override
  public void initStatics() {
    if (m != null) {
      return;
    }
    super.initStatics();
    try {
      m = new MessageDigest[CONCURRENT_DIGESTS];
      for (int i = 0; i < CONCURRENT_DIGESTS; i++) {
        m[i] = MessageDigest.getInstance(HASH_ALGO);
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static byte[] sbytesFromHex(String string) {
    if (string == null) {
      // allowed
    }
    else if (string.length() > HASH_LENGTH * 2) {
      throw new IllegalArgumentException("string length is " + string.length() + ".  Must be <= " + HASH_LENGTH * 2 + ".  string is '" + string + "'.");
    }
    byte[] b = new byte[HASH_LENGTH];
    if (string == null) {
      return b;
    }

    int n = string.length();
    for (int i = 0; i < n - 1; i += 2) {
      b[i / 2] = (byte) ((Character.digit(string.charAt(i), 16) << 4) + Character.digit(string.charAt(i + 1), 16));
    }
    return b;
  }

  public static CFLibKeyHash224 fromHex(String string) {
    byte[] b = sbytesFromHex(string);
    CFLibKeyHash224 h = new CFLibKeyHash224();
    h.bytes = b;
    return h;
  }

  public static Comparator<ICFLibKeyHash224> getComparator() {

    return new Comparator<ICFLibKeyHash224>() {
      @Override
      public int compare(ICFLibKeyHash224 a, ICFLibKeyHash224 b) {
        return compareOrdered(a, b);
      }
    };
  }

  public CFLibKeyHash224() {
    super();
  }

  /**
   * This is the hex code of the underlying ID. THIS IS NOT A HASHING FUNCTION.
   */
  public CFLibKeyHash224(String hexId) {
    super(hexId);
  }

  public CFLibKeyHash224(byte[] anId) {
    super(anId);
  }

  public CFLibKeyHash224(ICFLibKeyHash224 otherKey) {
	bytes = new byte[HASH_LENGTH];
	if(otherKey != null) {
		System.arraycopy(otherKey.getBytes(), 0, bytes, 0, HASH_LENGTH);
	}
  }

  public CFLibKeyHash224(ICFLibKeyHash256 otherKey) {
    super();
    if (otherKey == null) {
      bytes = new byte[HASH_LENGTH];
      return;
    }
    byte[] _newId = new byte[HASH_LENGTH];
    System.arraycopy(otherKey.getBytes(), 0, _newId, 0, HASH_LENGTH);
    this.bytes = _newId;
  }

  public CFLibKeyHash224(ICFLibKeyHash384 otherKey) {
    super();
    if (otherKey == null) {
      bytes = new byte[HASH_LENGTH];
      return;
    }
    byte[] _newId = new byte[HASH_LENGTH];
    System.arraycopy(otherKey.getBytes(), 0, _newId, 0, HASH_LENGTH);
    this.bytes = _newId;
  }

  public CFLibKeyHash224(ICFLibKeyHash512 otherKey) {
    super();
    if (otherKey == null) {
      bytes = new byte[HASH_LENGTH];
      return;
    }
    byte[] _newId = new byte[HASH_LENGTH];
    System.arraycopy(otherKey.getBytes(), 0, _newId, 0, HASH_LENGTH);
    this.bytes = _newId;
  }

  public static CFLibKeyHash224 fromInt(int v) {
    CFLibKeyHash224 h = nullGet();
    h.bytes[3] = (byte) (v & 0xFF);
    h.bytes[2] = (byte) ((v >> 8) & 0xFF);
    h.bytes[1] = (byte) ((v >> 16) & 0xFF);
    h.bytes[0] = (byte) ((v >> 24) & 0xFF);
    return h;
  }

  public CFLibKeyHash224(int notUsed) {
    super(notUsed);
  }

  public static final boolean isNull(CFLibKeyHash224 anId) {
    return anId == null || anId.isNull();
  }

  @Override
  public byte[] getBytes() {
    return bytes;
  }

  /**
   * Get a new hash object with the key set to all 0s
   */
  static public CFLibKeyHash224 nullGet() {
    CFLibKeyHash224 k = new CFLibKeyHash224(new byte[HASH_LENGTH]);
    return k;
  }

  static public String getNullString() {
    return "00000000000000000000000000000000000000000000000000000000";
  }

  /**
   * We want KeyHashXX to be immutable so this method shouldn't even exist;
   * however it is necessary for JPA. This is the only time it should be used.
   *
   * @param newBytes to be copied from.
   */
  @Override
  public void setBytes(byte[] newBytes) {
    if (newBytes == null) {
      throw new NullPointerException("newBytes must not be null.");
    }
    if (newBytes.length != HASH_LENGTH) {
      throw new IllegalArgumentException("newBytes must be of length " + HASH_LENGTH + ".");
    }
    bytes = newBytes.clone();
  }

  /** Copy into existing key */
  @Override
  public void setBytes(byte[] newBytes, int offset,  int length) {
      System.arraycopy(newBytes, offset, bytes, 0, Math.min(HASH_LENGTH,length));
  }

  public static CFLibKeyHash224 hash(String text) {
    if (text != null) {
      try {
        MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
        byte[] buf = text.getBytes("UTF-8");
        md.update(buf);

        return new CFLibKeyHash224(md.digest());
      }
      catch (Exception ex) {
      }
    }
    return new CFLibKeyHash224(0);
  }

  public static CFLibKeyHash224 hash(byte[] payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      md.update(payload);

      return new CFLibKeyHash224(md.digest());
    }
    catch (Exception ex) {
    }
    return new CFLibKeyHash224(0);
  }

  public static CFLibKeyHash224 hash(byte[]... payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (byte[] bs : payload) {
        md.update(bs);
      }

      return new CFLibKeyHash224(md.digest());
    }
    catch (Exception ex) {
    }
    return new CFLibKeyHash224(0);
  }

  public static CFLibKeyHash224 hash(ICFLibKeyHash224... payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (ICFLibKeyHash224 k : payload) {
        md.update(k.getBytes());
      }
      return new CFLibKeyHash224(md.digest());
    }
    catch (Exception ex) {
    }
    return new CFLibKeyHash224(0);
  }

  public static CFLibKeyHash224 hash(int[] payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (int x : payload) {
        md.update((byte) ((x >>> 24) & 255));
        md.update((byte) ((x >>> 16) & 255));
        md.update((byte) ((x >>> 8) & 255));
        md.update((byte) (x & 255));
      }

      return new CFLibKeyHash224(md.digest());
    }
    catch (Exception ex) {
    }
    return new CFLibKeyHash224(0);
  }

  @Override
  public CFLibKeyHash224 deepClone() {
    return new CFLibKeyHash224(this);
  }

  static public CFLibKeyHash224 fromHexQuick(String string) {
    if (string == null) {
      return null;
    }
    if (string.length() != HASH_LENGTH * 2) {
      return null;
    }
    for (int i = 0; i < string.length(); i++) {
      try {
        if (Character.digit(string.charAt(i), 16) < 0) {
          return null;
        }
      }
      catch (Exception e) {
        return null;
      }

    }
    try {
      return fromHex(string);
    }
    catch (Exception e) {
      return null;
    }
  }

  public static final CFLibKeyHash224[] toCFLibKeyHash224(String[] ids) {
    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return new CFLibKeyHash224[0];
    }
    CFLibKeyHash224[] r = new CFLibKeyHash224[ids.length];
    for (int i = 0; i < ids.length; i++) {
      r[i] = new CFLibKeyHash224(ids[i]);
    }
    return r;
  }

  public static final List<CFLibKeyHash224> toCFLibKeyHash224List(String[] ids) {

    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return Collections.emptyList();
    }
    List<CFLibKeyHash224> r = new ArrayList<CFLibKeyHash224>(ids.length);
    for (int i = 0; i < ids.length; i++) {
      r.add(new CFLibKeyHash224(ids[i]));
    }
    return r;

  }

  public static final Set<CFLibKeyHash224> toCFLibKeyHash224Set(String[] ids) {

    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return Collections.emptySet();
    }
    Set<CFLibKeyHash224> r = new HashSet<CFLibKeyHash224>(ids.length);
    for (int i = 0; i < ids.length; i++) {
      r.add(new CFLibKeyHash224(ids[i]));
    }
    return r;

  }
}
