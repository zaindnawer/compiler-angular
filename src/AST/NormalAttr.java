package AST;

public class NormalAttr implements Attributes{
    String NAME_HTML;
    String STRING_HTML;

    public String getNAME_HTML() {
        return NAME_HTML;
    }

    public void setNAME_HTML(String NAME_HTML) {
        this.NAME_HTML = NAME_HTML;
    }

    public String getSTRING_HTML() {
        return STRING_HTML;
    }

    public void setSTRING_HTML(String STRING_HTML) {
        this.STRING_HTML = STRING_HTML;
    }

    @Override
    public String toString() {
        return "NormalAttr{" +
                "NAME_HTML='" + NAME_HTML + '\'' +
                ", STRING_HTML='" + STRING_HTML + '\'' +
                '}';
    }
}
