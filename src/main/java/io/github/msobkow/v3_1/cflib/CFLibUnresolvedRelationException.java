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
 * CFLibUnresolvedRelationException is thrown when there is no target object for a foreign key found.
 */
public class CFLibUnresolvedRelationException extends IllegalStateException {

	protected String localMessage = null;

	protected String enRelnType = null;
	protected String xRelnType = null;

	protected String enRelnName = null;
	protected String xRelnName = null;

	protected String enRelnTarget = null;
	protected String xRelnTarget = null;

	protected Object indexKey = null;

	public CFLibUnresolvedRelationException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public CFLibUnresolvedRelationException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				enFieldName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public CFLibUnresolvedRelationException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUnresolvedRelationException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException()
	{
		super(String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"), ""));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"), "");
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName )
	{
		super( String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
					th);
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public CFLibUnresolvedRelationException(
		String enFieldName,
		String xFieldName,
		String methName,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
			th);
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName,
		String enRelationType,
		String xRelationType,
		String enRelationName,
		String xRelationName,
		String enTargetName,
		String xTargetName,
		Object indexKey)
	{
		super( (indexKey != null) ? String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enRelationType,
					enRelationName,
					indexKey.toString(),
					enTargetName)
				: String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enRelationType,
					enRelationName,
					enTargetName ));
		this.localMessage = (indexKey != null) ? String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					indexKey.toString(),
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName)
				: String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName);
		enRelnType = enRelationType;
		xRelnType = xRelationType;
		enRelnName = enRelationName;
		xRelnName = xRelationName;
		enRelnTarget = enTargetName;
		xRelnTarget = xTargetName;
		this.indexKey = indexKey;
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName,
		String enRelationType,
		String xRelationType,
		String enRelationName,
		String xRelationName,
		String enTargetName,
		String xTargetName,
		Object indexKey,
		Throwable th )
	{
		super( (indexKey != null) ? String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enRelationType,
					enRelationName,
					indexKey.toString(),
					enTargetName)
				: String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enRelationType,
					enRelationName,
					enTargetName ),
			th);
		this.localMessage = (indexKey != null) ? String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					indexKey.toString(),
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName)
				: String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName);
		enRelnType = enRelationType;
		xRelnType = xRelationType;
		enRelnName = enRelationName;
		xRelnName = xRelationName;
		enRelnTarget = enTargetName;
		xRelnTarget = xTargetName;
		this.indexKey = indexKey;
	}

	public CFLibUnresolvedRelationException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enRelationType,
		String xRelationType,
		String enRelationName,
		String xRelationName,
		String enTargetName,
		String xTargetName,
		Object indexKey)
	{
		super( (indexKey != null) ? String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enRelationType,
					enRelationName,
					indexKey.toString(),
					enTargetName)
				: String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enRelationType,
					enRelationName,
					enTargetName ));
		this.localMessage = (indexKey != null) ? String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					indexKey.toString(),
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName)
				: String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName);
		enRelnType = enRelationType;
		xRelnType = xRelationType;
		enRelnName = enRelationName;
		xRelnName = xRelationName;
		enRelnTarget = enTargetName;
		xRelnTarget = xTargetName;
		this.indexKey = indexKey;
	}

	public CFLibUnresolvedRelationException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enRelationType,
		String xRelationType,
		String enRelationName,
		String xRelationName,
		String enTargetName,
		String xTargetName,
		Object indexKey,
		Throwable th)
	{
		super( (indexKey != null) ? String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enRelationType,
					enRelationName,
					indexKey.toString(),
					enTargetName)
				: String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enRelationType,
					enRelationName,
					enTargetName ),
			th);
		this.localMessage = (indexKey != null) ? String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					indexKey.toString(),
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName)
				: String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName);
		enRelnType = enRelationType;
		xRelnType = xRelationType;
		enRelnName = enRelationName;
		xRelnName = xRelationName;
		enRelnTarget = enTargetName;
		xRelnTarget = xTargetName;
		this.indexKey = indexKey;
	}

	public String getRelationType() {
		return( enRelnType );
	}
	
	public String getRelationName() {
		return( enRelnName );
	}
	
	public String getRelationTarget() {
		return( enRelnTarget );
	}

	public String getLocalizedRelationType() {
		return( (xRelnType != null && !xRelnType.isEmpty()) ? xRelnType : enRelnType );
	}
	
	public String getLocalizedRelationName() {
		return( (xRelnName != null && !xRelnName.isEmpty()) ? xRelnName : enRelnName );
	}
	
	public String getLocalizedRelationTarget() {
		return( (xRelnTarget != null && !xRelnTarget.isEmpty()) ? xRelnTarget : enRelnTarget );
	}

	public Object getIndexKey() {
		return( indexKey );
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
