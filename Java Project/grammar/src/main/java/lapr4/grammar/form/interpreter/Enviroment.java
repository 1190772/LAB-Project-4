package lapr4.grammar.form.interpreter;

public class Enviroment {
    private static final String CFORM_EXTENSION = "cform";
    private static final String FVS = "fvs";
    private String homeDir;

    public String getHomeDir() {
        return this.homeDir;
    }

    public String getCompiledFormException() {
        return CFORM_EXTENSION;
    }

    public String getScriptExtension() {
        return FVS;
    }
}
