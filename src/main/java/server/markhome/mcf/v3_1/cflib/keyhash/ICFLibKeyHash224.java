/*
 *	Mark's Code Fractal CFLib KeyHash 3.1 Common Library
 *
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *
 *	CFLib KeyHash provides essential types and utilities for Code Fractal applications.
 *
 *	These files are part of Mark's Code Fractal CFLib KeyHash.
 *
 *	Mark's Code Fractal CFLib KeyHash is available under dual commercial license from
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
 *	Mark's Code Fractal CFLib KeyHash is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU Library General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	Mark's Code Fractal CFLib KeyHash is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU Library General Public License for more details.
 *
 *	You should have received a copy of the GNU Library General Public License
 *	along with Mark's Code Fractal CFLib KeyHash.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author msobkow
 */
public interface ICFLibKeyHash224 {
	static final public int HASH_LENGTH = 28; // hash size in bytes
	static final public int HASH_LENGTH_STRING = HASH_LENGTH * 2; // SHA-1 hash size as a string
	static final String HASH_ALGO = "SHA-224";
	static final String hexDigits = "0123456789abcdef";
	static final int UUID6_INDEX = 0;
	static final int UUID6_LENGTH = CFLibUuid6.TOTAL_BYTES;
	static final int COUNTER_INDEX = 28;
	static final int COUNTER_LENGTH = 8;
	static final int CLUSTERCODE_INDEX = 36;
	static final int CLUSTERCODE_LENGTH = 8;
	static final int PID_INDEX = 44;
	static final int PID_LENGTH = 8;
	static final int THREAD_INDEX = 52;
	static final int THREAD_LENGTH = 8;
	static final int HEADER_BYTES = 60;
	static final int RANDBYTES_INDEX = HEADER_BYTES;
	static final int RANDBYTES_LENGTH = 8;
	static final int TOTAL_BYTES = HEADER_BYTES + RANDBYTES_LENGTH;

	public byte[] getBytes();

	public void setBytes(byte[] bytes);

	public void setBytes(byte[] newBytes, int offset, int length);

	public void initStatics();

	public default byte[] bytesFromHex(String string) {
		if (string == null) {
			// allowed
		} else if (string.length() > HASH_LENGTH * 2) {
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

	public default int reduceToInt() {
		return hashCode();
	}

	public default boolean isNull() {
		byte[] b = getBytes();
		if (b != null) {
			for (int i = 0; i < HASH_LENGTH; i++) {
				if (b[i] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public default void toString(StringBuilder sb) {
		// Construct and return the representive hex string
		byte[] b = getBytes();
		if (b == null) {
			for (int i = 0; i < HASH_LENGTH; i++) {
				sb.append('0');
				sb.append('0');
			}
		} else {
			for (int i = 0; i < HASH_LENGTH; i++) {
				sb.append(hexDigits.charAt((b[i] & 0xF0) >>> 4));
				sb.append(hexDigits.charAt(b[i] & 0x0F));
			}
		}
	}

	public int compareTo(ICFLibKeyHash224 o);

	public default int compare(ICFLibKeyHash224 h1, ICFLibKeyHash224 h2) {
		if (h1 == null) {
			if (h2 == null) {
				return 0;
			} else {
				return 1;
			}
		} else {
			if (h2 == null) {
				return -1;
			} else {
				byte[] b1 = h1.getBytes();
				byte[] b2 = h2.getBytes();
				if (b1 == null) {
					if (b2 == null) {
						return 0;
					} else {
						return 1;
					}
				} else {
					if (b2 == null) {
						return -1;
					} else {
						for (int i = 0; i < h1.HASH_LENGTH; i++) {
							int v1 = b1[i];
							int v2 = b2[i];
							if (v1 < 0) {
								v1 += 256;
							}
							if (v2 < 0) {
								v2 += 256;
							}
							int c = v1 - v2;
							if (c != 0) {
								return c;
							}
						}
					}
				}
			}
		}
		return 0;
	}

	public ICFLibKeyHash224 deepClone();

  public default int getHashLength() {
    return HASH_LENGTH;
  }

  public default int getHashLengthString() {
    return HASH_LENGTH_STRING;
  }

  public default String getHashAlgo() {
    return HASH_ALGO;
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

  public static boolean isNull(ICFLibKeyHash224 anId) {
    return anId == null || anId.isNull();
  }

  static public String getNullString() {
    return "00000000000000000000000000000000";
  }

}
