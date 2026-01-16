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

import java.util.*;

import io.github.msobkow.v3_1.cflib.inz.Inz;

/**
 * CFLibUnrecognizedAttributeException is primarily thrown by the manufacted XML parsers.
 */
public class CFLibUnrecognizedAttributeException extends NoSuchElementException {

	protected String localMessage = null;
	protected String locInfo = null;
	protected String attrName = null;

	public CFLibUnrecognizedAttributeException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public CFLibUnrecognizedAttributeException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	// public CFLibUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	// public CFLibUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
	// 			th );
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	// public CFLibUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
	// 			enFieldName,
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
	// 			(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	// }

	// public CFLibUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
	// 			enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	// }

	// public CFLibUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
	// 			enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
	// 			th );
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	// }

	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUnrecognizedAttributeException()
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				"").trim());
		this.localMessage = String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
				"").trim();
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName,
		Throwable th )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}



	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String locInfo,
		String attrName,
		Throwable th )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}


	public String getLocInfo() {
		return locInfo;
	}

	public String getAttrName() {
		return attrName;
	}

	@Override
	public String getLocalizedMessage() {
		if (localMessage != null) {
			return localMessage;
		}
		else {
			return getMessage();
		}
	}
}
