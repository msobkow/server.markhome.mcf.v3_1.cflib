/*
 *	Mark's Code Fractal CFLib 3.1 Common Library
 *
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *
 *	This file is part of Mark's Code Fractal CFLib.
 *
 *	Mark's Code Fractal CFLib is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU Library General Public License,
 *	Version 3 or later.
 *
 *	Mark's Code Fractal CFLib is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU Library General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	Mark's Code Fractal CFLib is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU Library General Public License for more details.
 *
 *	You should have received a copy of the GNU Library General Public License
 *	along with Mark's Code Fractal CFLib.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *
 *	If you wish to modify and use this code without publishing your changes in order to
 *	tie it to proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package io.github.msobkow.v3_1.cflib;

import io.github.msobkow.v3_1.cflib.inz.Inz;

/**
 * CFLibCollisionDetectedException is thrown when there is already an existing entry with the specified key that conflicts with new data or other data changes.
 */
public class CFLibCollisionDetectedException extends CFLibRuntimeException {

	protected Object indexKey = null;

	public CFLibCollisionDetectedException(
		String enMsg,
		String xMsg )
	{
		super( enMsg, xMsg );
	}

	public CFLibCollisionDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( throwingClass, methName, enMsg, xMsg );
	}

	public CFLibCollisionDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( throwingClass, methName,  enMsg, xMsg, th );
	}

	public CFLibCollisionDetectedException(
		Class<?> throwingClass,
		String methName,
		Object argKey )
	{
		super( ((argKey != null)
					? String.format(Inz.s("cflib.CFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
						argKey.toString())
					: String.format(Inz.s("cflib.CFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )))),
				((argKey != null)
					? String.format(Inz.x("cflib.CFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
						argKey.toString())
					: String.format(Inz.s("cflib.CFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")))));
		indexKey = argKey;
	}

	public CFLibCollisionDetectedException(
		Class<?> throwingClass,
		String methName,
		Object argKey,
		Throwable th )
	{
		super( ((argKey != null)
					? String.format(Inz.s("cflib.CFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
						argKey.toString())
					: String.format(Inz.s("cflib.CFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")))),
				((argKey != null)
					? String.format(Inz.x("cflib.CFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
						argKey.toString())
					: String.format(Inz.s("cflib.CFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")))),
				th);
		indexKey = argKey;
	}

	public Object getIndexKey() {
		return( indexKey );
	}
}
