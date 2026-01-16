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

public class CFLibFireOnInstanceOf {
	
	protected Class<?> instOf = null;

    public CFLibFireOnInstanceOf() {
    	setInstanceOf( Object.class );
    }

    public void setInstanceOf(Class<?> value) {
    	final String S_ProcName = "setInstanceOf";
        if( value == null ) {
            throw new CFLibNullArgumentException( getClass(),
                S_ProcName,
                1,
                "value" );
        }
        instOf = value;
    }

	public Class<?> getInstanceOf() {
        return( instOf );
    }

    public boolean isInstanceOf( ICFLibAnyObj obj ) {
    	if( obj == null ) {
    		return( false );
    	}

    	if( instOf == null ) {
    		return( false );
    	}

    	return( instOf.isInstance( obj ) );
    }

    public void onInstanceOf( ICFLibAnyObj obj ) {
        final String S_ProcName = "onInstanceOf";
        if( obj == null ) {
            return;
        }
        throw new CFLibNotImplementedYetException( getClass(),
        	S_ProcName );
    }

    public final void fireOnInstanceOf( ICFLibAnyObj obj ) {
    	if( obj == null ) {
    		return;
    	}
        if( isInstanceOf( obj ) ) {
            onInstanceOf( obj );
        }
    }
}
