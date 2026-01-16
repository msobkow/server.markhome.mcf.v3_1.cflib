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
 * CFLibNullArgumentException is thrown when a required argument is null.
 */
public class CFLibNullArgumentException extends CFLibArgumentException {

	// Inherited constructor patterns

	public CFLibNullArgumentException(
		String enMsg,
		String xMsg )
	{
		super(enMsg, xMsg);
	}

	public CFLibNullArgumentException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(enMsg, xMsg, th);
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super(throwingClass, methName, enMsg, xMsg);
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super(throwingClass, methName, enMsg, xMsg, th);
	}

	public CFLibNullArgumentException(
	 	Class<?> throwingClass,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg )
	{
	 	super(throwingClass, methName, argNo, argName, enMsg, xMsg);
	}

	public CFLibNullArgumentException(
	 	Class<?> throwingClass,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg,
	 	Throwable th )
	{
	 	super(throwingClass, methName, argNo, argName, enMsg, xMsg, th);
	}

	// public CFLibNullArgumentException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super(enFieldName, xFieldName, enMsg, xMsg);
	// }

	public CFLibNullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg )
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg);
	}

	public CFLibNullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg, th);
	}

	public CFLibNullArgumentException(
	 	String enFieldName,
		String xFieldName,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
		String xMsg )
	{
	 	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg);
	}

	public CFLibNullArgumentException(
	 	String enFieldName,
		String xFieldName,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg,
	 	Throwable th )
	{
	 	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg, th);
	}

	// Custom/most-often-used constructors

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibNullArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
			String.format(Inz.x("cflib.CFLibNullArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		Throwable th)
	{
		super(String.format(Inz.s("cflib.CFLibNullArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
			String.format(Inz.x("cflib.CFLibNullArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
			th);
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName )
	{
		super(String.format(Inz.s("cflib.CFLibNullArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName),
			String.format(Inz.x("cflib.CFLibNullArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName));
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibNullArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName),
			String.format(Inz.x("cflib.CFLibNullArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName),
			th);
	}

	public CFLibNullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibNullArgumentException.FldMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
			String.format(Inz.x("cflib.CFLibNullArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
	}

	public CFLibNullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		Throwable th)
	{
		super(String.format(Inz.s("cflib.CFLibNullArgumentException.FldMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
			String.format(Inz.x("cflib.CFLibNullArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
			th);
	}

	public CFLibNullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName )
	{
		super(String.format(Inz.s("cflib.CFLibNullArgumentException.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName),
			String.format(Inz.x("cflib.CFLibNullArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName));
	}

	public CFLibNullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibNullArgumentException.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName),
			String.format(Inz.x("cflib.CFLibNullArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName),
			th);
	}
}
