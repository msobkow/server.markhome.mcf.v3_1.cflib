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

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * This variation on a UUID is based on supporting IPv6 as well as IPv4 host addresses for type 1 UUIDs.
 * <p>
 * The Uuid6 is a 28 byte value, represented as a 62 character string.  The string representation is
 * formatted as follows:
 * <blockquote><pre>
 * {@code
 * Uuid6                   = <time_stamp> "-"
 *                          <version_and_variant> "-"
 *                          <random> "-"
 *                          <node0> "-" <node1> "-" <node2> "-" <node3>
 * time_stamp             = 6*<hexOctet>
 * version_and_variant    = 2*<hexOctet>
 * random                 = 4*<hexOctet>
 * node0                  = 4*<hexOctet>
 * node1                  = 4*<hexOctet>
 * node2                  = 4*<hexOctet>
 * node3                  = 4*<hexOctet>
 * hexOctet               = <hexDigit><hexDigit>
 * hexDigit               =
 *       "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
 *       | "a" | "b" | "c" | "d" | "e" | "f"
 *       | "A" | "B" | "C" | "D" | "E" | "F"
 * }</pre></blockquote>
 * 
 * @author msobkow
 */
public interface ICFLibUuid6 {
    public static final int IPV6_LENGTH = CFLibHostAddr.IPV6_LENGTH;
    public static final int IPV4_LENGTH = CFLibHostAddr.IPV4_LENGTH;
    public static final int IPV4_PAD = CFLibHostAddr.IPV4_PAD;

    public final static int STAMP_START = 0;
    public final static int STAMP_BYTES = 6;
    public final static int VERSION_AND_VARIANT_START = STAMP_BYTES;
    public final static int VERSION_AND_VARIANT_BYTES = 2;
    public final static int RANDOM_START = VERSION_AND_VARIANT_START + VERSION_AND_VARIANT_BYTES;
    public final static int RANDOM_BYTES = 4;
    public final static int NODE0_START = RANDOM_START + RANDOM_BYTES;
    public final static int NODE0_BYTES = 4;
    public final static int NODE1_START = NODE0_START + NODE0_BYTES;
    public final static int NODE1_BYTES = 4;
    public final static int NODE2_START = NODE1_START + NODE1_BYTES;
    public final static int NODE2_BYTES = 4;
    public final static int NODE3_START = NODE2_START + NODE2_BYTES;
    public final static int NODE3_BYTES = 4;
    /**
     * Uuid6 values are 28 bytes long, representable as strings for transport
     */
    public final static int TOTAL_BYTES = NODE3_START + NODE3_BYTES;
    /**
     * String format for Uuid6 values is 62 characters long
     */
    public final static int STRING_LENGTH = (TOTAL_BYTES * 2) + 6;

    public byte[] getBytes();
}
