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
 * CFLibArgumentOverflowException indicates that an argument exceeds the permitted value range.
 */
public class CFLibArgumentOverflowException extends CFLibArgumentException {

	public CFLibArgumentOverflowException(
		String enMsg,
		String xMsg )
	{
		super(enMsg, xMsg);
	}

	public CFLibArgumentOverflowException(
		String enMsg, String xMsg, Throwable cause) {
			super(enMsg, xMsg, cause);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super(throwingClass, methName, enMsg, xMsg);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super(throwingClass, methName, enMsg, xMsg, th);
	}

	// public CFLibArgumentOverflowException(
	//  	Class<?> throwingClass,
	//  	String methName,
	//  	int argNo,
	//  	String argName,
	//  	String enMsg,
	//  	String xMsg )
	// {
	//  	super(throwingClass, methName, argNo, argName, enMsg, xMsg);
	// }

	// public CFLibArgumentOverflowException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	int argNo,
	// 	String argName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super(throwingClass, methName, argNo, argName, enMsg, xMsg, th);
	// }

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg )
	{
		super(enFieldName, xFieldName, enMsg, xMsg);
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg )
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg);
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg, th);
	}

	// public CFLibArgumentOverflowException(
	// 	String enFieldName,
	//  	String xFieldName,
	//  	String methName,
	//  	int argNo,
	//  	String argName,
	//  	String enMsg,
	//  	String xMsg )
	// {
	//  	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg);
	// }

	// public CFLibArgumentOverflowException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	int argNo,
	// 	String argName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg, th);
	// }


	
	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th );
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th);
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public CFLibArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th);
	}
}
