/*
 *	Mark's Code Fractal CFLib 3.1 Common Library
 *
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *
 *	CFLib provides the essential foundation classes for Code Fractal projects.
 *
 *	These files are part of Mark's Code Fractal CFLib.
 *
 *	Mark's Code Fractal CFLib is available under dual commercial license from
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

package server.markhome.mcf.v3_1.cflib;

import java.util.Calendar;

import server.markhome.mcf.v3_1.cflib.inz.Inz;

import java.math.*;

/**
 * CFLibArgumentRangeException indicates that a value did not fall with the range minValue to maxValue, inclusive.
 */
public class CFLibArgumentRangeException extends CFLibArgumentException {
	
	public CFLibArgumentRangeException(
		String enMsg,
		String xMsg )
	{
		super(enMsg, xMsg);
	}

	public CFLibArgumentRangeException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, xMsg, th);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super(throwingClass, methName, enMsg, xMsg);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super(throwingClass, methName, enMsg, xMsg, th);
	}

	public CFLibArgumentRangeException(
	 	Class<?> throwingClass,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg )
	{
	 	super(throwingClass, methName, argNo, argName, enMsg, xMsg);
	}

	public CFLibArgumentRangeException(
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

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg )
	{
		super(enFieldName, xFieldName, enMsg, xMsg);
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg )
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg);
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg, th);
	}

	public CFLibArgumentRangeException(
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

	public CFLibArgumentRangeException(
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



	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		short maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		short maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		int maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		int maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		long maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		long maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		float maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		float maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		double maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		double maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Calendar maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()));
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Calendar maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			th);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		String maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		String maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		BigDecimal maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()));
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			th);
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		short maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		short maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		int maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		int maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		long maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		long maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		float maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		float maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		double maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		double maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Calendar maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()));
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Calendar maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			th);
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		String maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		String maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
			th);
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		BigDecimal maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()));
	}

	public CFLibArgumentRangeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
			th);
	}
}
