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
import io.github.msobkow.v3_1.cflib.xml.CFLibXmlUtil;

/**
 * The CFRelationType defines the common relationship types found in a generic business ERD model.
 * 
 * Note that Container-Component, Parent-Child, and Master-Detail are NOT identical relationships.
 * For example, there can only be one Container relationship from a Component to it's document Container,
 * but there can be multiple Parent-Child relationships which perform a similar function of implying cascading
 * deletion of Component/Child relationship data when the Container/Parent is deleted, but do not define the
 * container hierarchy used by XML and JSON structured document formats in the same way. The Container-Component
 * relationship defines the document hierarchy for XML and JSON structured document formats. The document hierarchy
 * name also defines the dot-name hierarchy, where applicable.
 * 
 * For the sake of simplicity and efficiency, the JSON data types use the same XML utilities as the XML document
 * formats, so the JSON data stream looks like it is comprised of XML data which has just had it's structural
 * details changed.
 * 
 * @see CFLibXmlUtil
 * 
 * The Lookup relationship is special; it implies that the target does not allow deletion and has to be pre-loaded and cached by the client and middleware.
 * You can add new lookups, but you can't delete them. It also doesn't block deletion of the object which defines the relationship.
 * 
 * The Unknown relationship does not do cascading deletes, but nor does it block deletion of the object which defines the relationship.
 */
@SuppressWarnings("unused")
public enum CFRelationType {
    Container("N", "Container", "cflib.CFRelationType.Container"),
    Component("P", "Component", "cflib.CFRelationType.Component"),
    Parent( "P", "Parent", "cflib.CFRelationType.Parent"),
    Child("C", "Child", "cflib.CFRelationType.Child"),
    Master("M", "Master", "cflib.CFRelationType.Master"),
    Detail("D", "Detail", "cflib.CFRelationType.Detail"),
    Lookup("L", "Lookup", "cflib.CFRelationType.Lookup"),
    Unknown("U", "Unknown", "cflib.CFRelationType.Unknown");

    private final String key;
    private final String label;
    private final String inzLabelKey;

    private CFRelationType(String key, String label, String inzLabelKey) {
        this.key = key;
        this.label = label;
        this.inzLabelKey = inzLabelKey;
    }

    /**
     * Get the one-character key string for this enum value.
     * 
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * Get the character key for this enum value.
     * 
     * @return
     */
    public Character getChKey() {
        return key.charAt(0);
    }

    /**
     * Return the compiled-in label for this enum value.
     * 
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * Return the Inz key for the NLS label corresponding to this enum value.
     * 
     * @return
     */
    public String getInzLabelKey() {
        return inzLabelKey;
    }

    /**
     * Return the Inz.s() value for the Inz label key of this enum value. Might not be equal to the compiled-in English labels.
     * 
     * @see Inz.s
     * 
     * @return
     */
    public String s() {
        return Inz.s(inzLabelKey);
    }

    /**
     * Return the Inz.x() value for the Inz label key of this enum value. Never cache the result, as it changes depending on the user's runtime context.
     * 
     * @see Inz.x
     * 
     * @return
     */
    public String x() {
        return Inz.x(inzLabelKey);
    }
}
