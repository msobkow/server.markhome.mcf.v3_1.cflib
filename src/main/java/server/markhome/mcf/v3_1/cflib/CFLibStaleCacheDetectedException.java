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

import server.markhome.mcf.v3_1.cflib.inz.Inz;

/**
 * CFLibStaleCacheDetectedException is thrown when a cache or the objects in the cache have become stale and need to be refreshed from persistent storage before proceeding.
 */
public class CFLibStaleCacheDetectedException extends IllegalStateException {

	protected String localMessage = null;
	protected String enMsgCause = null;
	protected String xMsgCause = null;
	protected String enTargetTable = null;
	protected String xTargetTable = null;
	protected Object indexKey = null;

	public CFLibStaleCacheDetectedException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public CFLibStaleCacheDetectedException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException()
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"), "").trim());
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"), "").trim();
	}

	public CFLibStaleCacheDetectedException(Throwable th)
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"), "").trim(), th);
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"), "").trim();
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
			th);
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsgCause,
		String xMsgCause,
		String enTargetTable,
		String xTargetTable,
		Object argKey )
	{
		super( ((enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							enTargetTable,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							enTargetTable))
					: ((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause))));
		this.localMessage = (((xTargetTable != null && !xTargetTable.isEmpty()) || (enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable,
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable))
					: ((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause)))));
		this.enMsgCause = enMsgCause;
		this.xMsgCause = xMsgCause;
		this.enTargetTable = enTargetTable;
		this.xTargetTable = xTargetTable;
		this.indexKey = argKey;
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsgCause,
		String xMsgCause,
		String enTargetTable,
		String xTargetTable,
		Object argKey,
		Throwable th )
	{
		super( ((enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							enTargetTable,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							enTargetTable))
					: ((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause))),
			th);
		this.localMessage = (((xTargetTable != null && !xTargetTable.isEmpty()) || (enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable,
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable))
					: ((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause)))));
		this.enMsgCause = enMsgCause;
		this.xMsgCause = xMsgCause;
		this.enTargetTable = enTargetTable;
		this.xTargetTable = xTargetTable;
		this.indexKey = argKey;
	}

	public Object getIndexKey() {
		return indexKey;
	}

	public String getMsgCause() {
		return enMsgCause;
	}

	public String getLocalizedMsgCause() {
		if (xMsgCause != null && !xMsgCause.isEmpty())
			return xMsgCause;
		else
			return enMsgCause;
	}

	public String getTargetTable() {
		return enTargetTable;
	}

	public String getLocalizedTargetTable() {
		if (xTargetTable != null && !xTargetTable.isEmpty())
			return xTargetTable;
		else
			return enTargetTable;
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
