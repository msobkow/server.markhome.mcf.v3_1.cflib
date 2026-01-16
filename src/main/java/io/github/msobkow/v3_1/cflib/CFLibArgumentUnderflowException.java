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

import java.util.Calendar;

import io.github.msobkow.v3_1.cflib.inz.Inz;

import java.math.*;

/**
 * CFLibArgumentUnderflowException is thrown when an argument is under the minimum value allowed.
 */
public class CFLibArgumentUnderflowException extends CFLibArgumentException {

	public CFLibArgumentUnderflowException(
		String enMsg,
		String xMsg )
	{
		super( enMsg, xMsg );
	}

	public CFLibArgumentUnderflowException(
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( enMsg, xMsg, th );
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( throwingClass, methName, enMsg, xMsg );
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( throwingClass, methName, enMsg, xMsg, th );
	}

	// public CFLibArgumentUnderflowException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	int argNo,
	// 	String argName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( throwingClass, methName, argNo, argName, enMsg, xMsg );
	// }

	// public CFLibArgumentUnderflowException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	int argNo,
	// 	String argName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( throwingClass, methName, argNo, argName, enMsg, xMsg, th );
	// }

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()));
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
			th);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()));
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
			th);
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg )
	{
		super( enFieldName, xFieldName, enMsg, xMsg );
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( enFieldName, xFieldName, methName, enMsg, xMsg );
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( enFieldName, xFieldName, methName, enMsg, xMsg, th );
	}

// 	public CFLibArgumentUnderflowException(
// 		String enFieldName,
// 		String xFieldName,
// 		String methName,
// 		int argNo,
// 		String argName,
// 		String enMsg,
// 		String xMsg )
// 	{
// 		super( enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg );
// 	}

// 	public CFLibArgumentUnderflowException(
// 		String enFieldName,
// 		String xFieldName,
// 		String methName,
// 		int argNo,
// 		String argName,
// 		String enMsg,
// 		String xMsg,
// 		Throwable th )
// 	{
// 		super( enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg, th );
// 	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue.toString(),
				minValue.toString()));
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue.toString(),
				minValue.toString()),
			th);
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue));
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				minValue),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue,
				minValue),
			th);
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue.toString(),
				minValue.toString()));
	}

	public CFLibArgumentUnderflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				(argName),
				argValue.toString(),
				minValue.toString()),
			th);
	}
}
