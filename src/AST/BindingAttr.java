package AST;

public class BindingAttr implements Attributes{
    String BINDING_HTML;
    String STRING_HTML;

    public String getBINDING_HTML() {
        return BINDING_HTML;
    }

    public void setBINDING_HTML(String BINDING_HTML) {
        this.BINDING_HTML = BINDING_HTML;
    }

    public String getSTRING_HTML() {
        return STRING_HTML;
    }

    public void setSTRING_HTML(String STRING_HTML) {
        this.STRING_HTML = STRING_HTML;
    }

    @Override
    public String toString() {
        return "BindingAttr{" +
                "BINDING_HTML='" + BINDING_HTML + '\'' +
                ", STRING_HTML='" + STRING_HTML + '\'' +
                '}';
    }
}
