package server.markhome.mcf.v3_1.cflib;

public class CFLibLibraryEntry {

	public static int main(int argc, String[] argv) {
		return 0;
	}

	public static String getCFLibName() {
		return ( CFLibLibraryEntry.getCFLibName() + "-core");
	}

	public static String getCFLibVersion() {
		return ( CFLibLibraryEntry.getCFLibVersion() );
	}
}
