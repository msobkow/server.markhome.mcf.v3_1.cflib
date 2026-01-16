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

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *	MessageLog implementations support indented application messaging.
 *	A given log implementation might also implement the ErrorLog interface,
 *	allowing it to display an interleaved mix of application and error
 *	messages.
 *	<p>
 *	All methods of the interface are expected to be synchronized.
 */
public interface ICFLibMessageLog {

	/**
	 *	Get an PrintStream that wraps this log
	 */
	public PrintStream getPrintStream();
	
	/**
	 *	Get the current log indent level.
	 */
	public int getMessageLogIndent();
	
	/**
	 *	Increase the log indentation.
	 */
	public void indent();
	
	/**
	 *	Decrease the log indentation.
	 */
	public void dedent();
	
	/**
	 *	Log an application message.
	 */
	public void message( String msg );
	
	/**
	 *	Open the specified file for logging
	 *
	 *	@param	fileName	The name of the file to open as a log.
	 */
	public void openLogFile( String fileName )
		throws FileNotFoundException;
	
	/**
	 *	Close the log file.
	 */
	public void closeLogFile();
}
