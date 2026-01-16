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
 * CFLibDependentsDetectedException is thrown when an object cannot be deleted because it has dependent objects which are not flagged for cascading deletes.
 */
public class CFLibDependentsDetectedException extends CFLibRuntimeException {

	protected String enRelnType = null;
	protected String xRelnType = null;

	protected String enRelnName = null;
	protected String xRelnName = null;

	protected String enRelnTarget = null;
	protected String xRelnTarget = null;

	protected Object indexKey = null;

	public CFLibDependentsDetectedException(
		String enMsg,
		String xMsg )
	{
		super( enMsg, xMsg );
	}

	public CFLibDependentsDetectedException(
		String enMsg,
		String xMsg,
		Object indexKey )
	{
		super( enMsg, xMsg );
		this.indexKey = indexKey;
	}

	public CFLibDependentsDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( throwingClass, methName, enMsg, xMsg );
	}

	public CFLibDependentsDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Object indexKey )
	{
		super( throwingClass, methName, enMsg, xMsg );
		this.indexKey = indexKey;
	}

	public CFLibDependentsDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( throwingClass, methName, enMsg, xMsg, th );
	}

	public CFLibDependentsDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Object indexKey,
		Throwable th )
	{
		super( throwingClass, methName, enMsg, xMsg, th );
		this.indexKey = indexKey;
	}

	public CFLibDependentsDetectedException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super( 
				String.format(Inz.s("cflib.CFLibDependentsDetectedException.sqlexcept"),
					(throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
					th.getMessage()),
				String.format(Inz.x("cflib.CFLibDependentsDetectedException.sqlexcept"),
					(throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
					th.getMessage()),
				th);
	}

	public CFLibDependentsDetectedException(
		Class<?> throwingClass,
		String methName,
		Object indexKey )
	{
		super( ((indexKey != null)
					? String.format(Inz.s("cflib.CFLibDependentsDetectedException.indexKey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibDependentsDetectedException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )))),
				((indexKey != null)
					? String.format(Inz.x("cflib.CFLibDependentsDetectedException.indexKey"),
						(throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibDependentsDetectedException.default"),
						(throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : "")))));
		this.indexKey = indexKey;
	}

	public CFLibDependentsDetectedException(
		Class<?> throwingClass,
		String methName,
		Object indexKey,
		Throwable th)
	{
		super( ((indexKey != null)
					? String.format(Inz.s("cflib.CFLibDependentsDetectedException.indexKey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibDependentsDetectedException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )))),
				((indexKey != null)
					? String.format(Inz.x("cflib.CFLibDependentsDetectedException.indexKey"),
						(throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibDependentsDetectedException.default"),
						(throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : "")))),
				th);
		this.indexKey = indexKey;
	}

	public CFLibDependentsDetectedException(
		Class<?> throwingClass,
		String methName,
		String enRelationType,
		String xRelationType,
		String enRelationName,
		String xRelationName,
		String enTargetName,
		String xTargetName,
		Object indexKey )
	{
		super( ((indexKey != null) ?
				String.format(Inz.s("cflib.CFLibDependentsDetectedException.indexKey"),
					(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
					enRelationType, enRelationName, enTargetName, indexKey.toString())
				: String.format(Inz.s("cflib.CFLibDependentsDetectedException.default"),
					(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
					enRelationType, enRelationName, enTargetName)),
			((indexKey != null) ?
				String.format(Inz.x("cflib.CFLibDependentsDetectedException.indexKey"),
					(throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName,
					indexKey.toString())
				: String.format(Inz.s("cflib.CFLibDependentsDetectedException.default"),
					(throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName)));
		enRelnType = enRelationType;
		xRelnType = xRelationType;
		enRelnName = enRelationName;
		xRelnName = xRelationName;
		enRelnTarget = enTargetName;
		xRelnTarget = xTargetName;
		this.indexKey = indexKey;
	}

	public CFLibDependentsDetectedException(
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
		super( ((indexKey != null) ?
				String.format(Inz.s("cflib.CFLibDependentsDetectedException.indexKey"),
					(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
					enRelationType, enRelationName, enTargetName, indexKey.toString())
				: String.format(Inz.s("cflib.CFLibDependentsDetectedException.default"),
					(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
					enRelationType, enRelationName, enTargetName)),
			((indexKey != null) ?
				String.format(Inz.x("cflib.CFLibDependentsDetectedException.indexKey"),
					(throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName,
					indexKey.toString())
				: String.format(Inz.s("cflib.CFLibDependentsDetectedException.default"),
					(throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName)));
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
}
