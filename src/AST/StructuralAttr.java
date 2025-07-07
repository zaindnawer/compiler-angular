package AST;

public class StructuralAttr implements Attributes {
    String STRUCTURAL_DIR_HTML;
    String STRING_HTML;

    public String getSTRUCTURAL_DIR_HTML() {
        return STRUCTURAL_DIR_HTML;
    }

    public void setSTRUCTURAL_DIR_HTML(String STRUCTURAL_DIR_HTML) {
        this.STRUCTURAL_DIR_HTML = STRUCTURAL_DIR_HTML;
    }

    public String getSTRING_HTML() {
        return STRING_HTML;
    }

    public void setSTRING_HTML(String STRING_HTML) {
        this.STRING_HTML = STRING_HTML;
    }

    @Override
    public String toString() {
        return "StructuralAttr{" +
                "STRUCTURAL_DIR_HTML='" + STRUCTURAL_DIR_HTML + '\'' +
                ", STRING_HTML='" + STRING_HTML + '\'' +
                '}';
    }
}
