package server.markhome.mcf.v3_1.cflib;

import org.teavm.jso.export.JSExport;

public class CFLibLibraryEntry {

	@JSExport
	public static String getCFLibName() {
		return ("server.markhome.mcf.v3_1.cflib");
	}

	@JSExport
	public static String getCFLibVersion() {
		return ("3.1.42");
	}
}
