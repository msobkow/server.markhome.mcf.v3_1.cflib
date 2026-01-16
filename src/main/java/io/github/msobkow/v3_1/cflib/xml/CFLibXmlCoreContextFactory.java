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

package io.github.msobkow.v3_1.cflib.xml;

import io.github.msobkow.v3_1.cflib.ICFLibMessageLog;

/**
 *	An XML Core Context Factory instantiates new instances
 *	derived from XmlCoreContext. 
 */
public interface CFLibXmlCoreContextFactory {

	/**
	 *	Get the application processing logger.
	 *
	 *	@return	The application processing Log4J Logger.
	 */
	public ICFLibMessageLog getLog();

	/**
	 *	Copy an XML Core Context.
	 *
	 *	@param	src	The context to copy.
	 *	@param	qName	The QName of the element about to be processed.
	 *	@param	handler	The XmlCoreElementHandler which will be used for processing.
	 */
	public CFLibXmlCoreContext newXmlCoreContext(
		CFLibXmlCoreContext src,
		String qName,
		CFLibXmlCoreElementHandler handler );

	/**
	 *	Construct a "root" XML Core Context instance.
	 *
	 *	@param	coreParser	The parser which owns this instance.
	 *	@param	log	ICFLibMessageLog to use, if null, use parser's logger.
	 *	@param	handler	The XmlCoreElementHandler which will be processing the doc root.
	 */
	public CFLibXmlCoreContext newXmlCoreContext(
		CFLibXmlCoreParser coreParser,
		ICFLibMessageLog jLogger,
		CFLibXmlCoreElementHandler elementHandler );

}
