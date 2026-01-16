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

import java.io.*;

public class CFLibCachedMessageLog
implements ICFLibMessageLog {

	private StringBuffer cacheContents = new StringBuffer();
	private int		   	indent = 0;
	
	/**
	 *	Default constructor.
	 */
	public CFLibCachedMessageLog() {
		indent = 0;
	}

	public void clearCache() {
		cacheContents.setLength( 0 );
	}

	public String getCacheContents() {
		return( cacheContents.toString() );
	}
	
	public int getMessageLogIndent() {
		return( indent );
	}
	
	public synchronized void dedent() {
		if( indent > 0 ) {
			indent --;
		}
		else {
			indent = 0;
		}
	}
	
	public synchronized void indent() {
		indent ++;
	}
	
	public synchronized void message( String msg ) {

		if( msg == null ) {
			return;
		}

		int			i;
		for( i = ( ( cacheContents.length() <= 0 ) ? 1 : 0 ); i < indent; i ++ ) {
			cacheContents.append( "\t" );
		}
		cacheContents.append( msg );
		if( ! msg.endsWith( "\n" ) ) {
			cacheContents.append( "\n" );
		}
	}

//	OLD API's that need to go away

	public PrintStream getPrintStream() {
		return( null );
	}

	public void openLogFile( String fileName )
		throws FileNotFoundException
	{
		// Do-nothing stub; cached message logs don't write to files
	}
	
	public void closeLogFile() {
		// Do-nothing stub; cached message logs don't write to files
	}
}
