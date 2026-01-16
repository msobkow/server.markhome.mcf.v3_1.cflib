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

package io.github.msobkow.v3_1.cflib.inz;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Inz is the main class for the CFLib Internationalization (Inz) library.
 * It provides a framework for managing translations and language files.
 * The Inz class is responsible for loading language files, managing language codes,
 * and providing access to translations through the InzLang class.
 */
public class Inz {
//    public static final String CFLIB_INZ_PATH = "/io.github.msobkow.v3_1.cflib/src/main/resources/inz/langs";
    public static final String CFLIB_INZ_PATH = "resource://inz/langs";

    /**
     * The language file path is a list of semicolon-separated path names to language file directories.
     * In each directory may be any number of 2 or 5 letter .properties files which are loaded on a per-language basis,
     * with the pre-".properties" portion of the file name used as the language code.
     * The built-in default path is "resource:io.github.msobkow.v3_1.cflib/inz/langs".  Although the only populated
     * language in that resource directory is "en", there is a hierarchy of accepted language codes and their fallbacks
     * defined with no actual translations in them, so the default for CFLib is to report all exceptions in English.
     */
    protected static ArrayList<InzPathEntry> pathEntries = new ArrayList<>();
    static {
        // Add the default CFLib Inz path entry
        pathEntries.add(new InzPathEntry(Inz.class, CFLIB_INZ_PATH));
//        pathEntries.add(new InzPathEntry("/opt/mcf/v3_1/java" + CFLIB_INZ_PATH));
    }

    /**
     * The language file entries matching the langPath.
     */
    protected static ArrayList<InzEntry> entries = new ArrayList<>();

    /**
     * The default language code used when no specific language is set.
     * This is typically "en" for English.
     */
    public static final String DEFAULT_LANG_CODE = "en";
    
    /**
     * The current system language code, used for the single-argument version of x().
     */
    protected static String systemLangCode = DEFAULT_LANG_CODE;

    protected static AtomicReference<IInzEffectiveLangCode> effectiveLangCallback = new AtomicReference<>(null);

    /**
     * The CFLib InzEntry references resource:io.github.msobkow.v3_1.cflib/inz/langs and
     * defines the hierarchy of language codes.  All other language codes hierarchy information
     * is ignored and overwritten by the hierarchy information from the CFLib InzEntry.
     */
    public static final InzEntry CFLIB_INZ_ENTRY;
    static {
        CFLIB_INZ_ENTRY = new InzEntry(pathEntries.get(0));
        entries.add(CFLIB_INZ_ENTRY);
    }

    /**
     * Private constructor to prevent instantiation.
     * This class is designed to be used as a singleton, so the constructor is private.
     */
    private Inz() {
       
    }

    /**
     * Add a language path entry to the list of path entries, load and initialize it, and wire it for translations
     * @param pathEntry The InzPathEntry to add.
     */
    public static void addPathEntry(InzPathEntry pathEntry) {
        if (pathEntry == null) {
            throw new IllegalArgumentException("Path entry cannot be null.");
        }
        if (!pathEntries.contains(pathEntry)) {
            pathEntries.add(pathEntry);
            InzEntry entry = new InzEntry(pathEntry);
            entry.loadLangs();
            entries.add(entry);
        } // else {
        //     throw new IllegalArgumentException("Path entry already exists: " + pathEntry.getPath());
        // }
    }

    /**
     * Get the list of path entries.
     * This method returns the current list of InzPathEntry objects.
     *
     * @return The list of InzPathEntry objects.
     */
    public static ArrayList<InzPathEntry> getPathEntries() {
        return new ArrayList<>(pathEntries); // Return a copy to prevent external modification
    }

    /**
     * Load the language entries and their language translations from the path specified.
     * This method will clear existing entries if forceReload is true.
     * It will throw an IllegalStateException if the language path is not set or is empty.
     * It will throw an IllegalArgumentException if the path does not exist or is not a directory.
     * If any error occurs while loading the entries, it will throw a RuntimeException.
     *
     * @param forceReload If true, existing entries will be cleared before loading new ones.
     * @throws IllegalStateException if the language path is not set or is empty.
     * @throws IllegalArgumentException if the path does not exist or is not a directory.
     * @throws RuntimeException if an error occurs while loading the entries.
     * @see InzEntry#loadLangs()
     * @see InzLang
     * @see Inz#x(String, String)
     * @see InzEntry
     * @see InzLang#x(String)
     * 
     * This method is typically called to initialize the language entries before using the translation methods.
     * It allows for dynamic loading of language files from specified directories.
     * If the language path is not set, it will throw an exception to ensure that the user sets it before attempting to load entries.
     * The method supports reloading of entries by clearing existing ones if `forceReload` is true.
     * It iterates through each path in the semicolon-separated list, checking if the path exists and is a directory,
     * and then attempts to load language files from that directory.
     * If any path does not exist or is not a directory, it throws an IllegalArgumentException.
     * If an error occurs while loading the language files, it throws a RuntimeException with the error details.
     * The method ensures that all loaded entries are added to the `entries` list for later use in translations.
     * 
     * Example usage:
     * <pre>
     * Inz inz = new Inz();
     * inz.setLangPath("path/to/languages");
     * inz.loadLangEntries(true); // Load entries, clearing existing ones if any
     * String translation = inz.x("greeting", "en"); // Get translation for 'greeting' in English
     * </pre>
     */
    public static void loadLangEntries(boolean forceReload) {
        if (pathEntries == null || pathEntries.isEmpty()) {
            throw new IllegalStateException("Path entries are not set");
        }
        if (forceReload) {
            entries.clear(); // Clear existing entries if force reload is requested
        }
        if (entries.size() <= 1) {
            if (entries.isEmpty()) {
                entries.add(CFLIB_INZ_ENTRY); // Ensure the CFLib InzEntry is
            }
            for (int idx = 1; idx < pathEntries.size(); idx++) {
                InzPathEntry pathEntry = pathEntries.get(idx);
                if (pathEntry == null || pathEntry.getPath() == null || pathEntry.getPath().isEmpty()) {
                    throw new IllegalStateException("Path entry is not set for index: " + idx);
                }
                InzEntry entry = new InzEntry(pathEntry);
                try {
                    entry.loadLangs();
                    entries.add(entry);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to load language entries from path: " + pathEntry.getPath(), e);
                }
            }   
        }
    }

    /**
     * Get the current system language code.
     * This method returns the language code currently set for the system.
     *
     * @return The current system language code as a String.
     */
    public static String getSystemLangCode() {
        return systemLangCode;
    }

    /**
     * Set the current system language code.
     * @param langCode
     */
    public static void setSystemLangCode(String langCode) {
        if (langCode == null || langCode.isEmpty()) {
            throw new IllegalArgumentException("Language code cannot be null or empty.");
        }
        if (langCode.length() != 2 && langCode.length() != 5) {
            throw new IllegalArgumentException("Language code must be 2..5 characters");
        }
        if (langCode.length() == 5 && langCode.charAt(2) != '-') {
            throw new IllegalArgumentException( "5-character language code must be separated in position 2 by a hyphen");
        }
        systemLangCode = langCode.toLowerCase(); // Store the language code in lowercase for consistency
    }

    /**
     * Set the callback hook for getting the current session's language id string.
     * 
     * @param callback
     * @return The previously registered callback
     */
    public static IInzEffectiveLangCode installEffectiveLangCodeCallback(IInzEffectiveLangCode callback) {
        IInzEffectiveLangCode prevCallback = effectiveLangCallback.get();
        if (prevCallback != callback) {
            effectiveLangCallback.compareAndSet(prevCallback, callback);
            if (callback == effectiveLangCallback.get()) {
                return prevCallback;
            }
            else {
                throw new IllegalStateException("Error registering replacement Effective Language Code callback");
            }
        }
        else {
            return prevCallback;
        }
    }

    /**
     * Get the callback hook for getting the current session's language id string.
     * 
     * @return The IInzEffectiveLangId callback that was most recently installed; initially null.
     */
    public static IInzEffectiveLangCode getEffectiveLangCodeCallback() {
        return effectiveLangCallback.get();
    }

    /**
     * Get the current effective language id.  If any exceptions are thrown by the most recently installed callback, the system language code is used. If that isn't valid, the language defaults to "en".
     * 
     * @return The current effective language id.
     */
    public static String getEffectiveLangCode() {
        String effLangCode;
        IInzEffectiveLangCode cb = getEffectiveLangCodeCallback();
        if (cb != null) {
            try {
                effLangCode = cb.getEffectiveLangCode();
            }
            catch (Exception ex) {
                effLangCode = null;
            }
        }
        else {
            effLangCode = null;
        }

        if (effLangCode == null || effLangCode.isEmpty()) {
            effLangCode = getSystemLangCode();
        }

        if (effLangCode == null || effLangCode.isEmpty()) {
            effLangCode = "en";
        }

        return effLangCode;
    }

    /**
     * Get a translation for a given key in the current system language, probing each of the path entries in order
     * until a non-null translation is found.  If no translation is found, it returns "!key!".
     * @param key The translation key to look up.
     * @return The translated string if found, or "!key!" if not found.
     * @throws IllegalArgumentException if the key is null or empty.
     * @see InzEntry#x(String, String)
     * @see InzLang#x(String)
     */
    public static String x(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        return x(key, getEffectiveLangCode());
    }

    /**
     * Get a translation for a given key in the specified language, probing each of the path entries in order
     * until a non-null translation is found.  If no translation is found, it returns "!key!".
     * This method is case-insensitive for both the key and the language code.
     * @param key The translation key to look up.
     * @param langCode The language code to use for the translation.
     * @return The translated string if found, or "!key!" if not found.
     * @throws IllegalArgumentException if the key or language code is null or empty.
     * @see InzEntry#x(String, String)
     * @see InzLang#x(String)
     */
    public static String x(String key, String langCode) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        if (langCode == null || langCode.isEmpty()) {
            throw new IllegalArgumentException("Language code cannot be null or empty.");
        }
        if (langCode.length() != 2 && !(langCode.length() == 5 && langCode.charAt(2) == '-')) {
            throw new IllegalArgumentException("Language code must be a 2-character or 5-character language code");
        }
        String lowerLangCode = langCode.toLowerCase();
        while (lowerLangCode != null) {
            for (int i = entries.size() - 1; i >= 0; i--) {
                InzEntry entry = entries.get(i);
                String translation = entry.x(key, lowerLangCode);
                if (translation != null) {
                    return translation; // Return the first non-null translation found
                }
            }
            if (lowerLangCode.length() == 5) {
                lowerLangCode = lowerLangCode.substring(0,1);
            }
            else {
                if ("en".equals(lowerLangCode)) {
                    lowerLangCode = null;
                }
                else {
                    lowerLangCode = "en";
                }
            }
        }
        // If no translation is found, return the key wrapped in exclamation marks
        return "!" + key + "!";
    }

    /**
     * Get a system English translation for a given key using resource path entries only.
     * @param key The translation key to look up.
     * @return The translated string if found, or "!key!" if not found.
     * @throws IllegalArgumentException if the key is null or empty.
     * @see InzEntry#x(String, String)
     * @see InzLang#x(String)
     */
    public static String s(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        for (int i = entries.size() - 1; i >= 0; i--) {
            InzEntry entry = entries.get(i);
            if (entry.getPathEntry().getClazz() != null && entry.getPathEntry().getPath().startsWith("resource:")) {
                String translation = entry.x(key, "en");
                if (translation != null) {
                    return translation; // Return the first non-null translation found
                }
            }
        }
        // If no translation is found, return the key wrapped in exclamation marks
        return "!" + key + "!";
    }
}
