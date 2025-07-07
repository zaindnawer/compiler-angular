package AST;

public class ImportComponent implements ImportDeclaration {
    String Import;
    String COMPONENT;
    String From;
    String STRING_LIT;

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public String getCOMPONENT() {
        return COMPONENT;
    }

    public void setCOMPONENT(String COMPONENT) {
        this.COMPONENT = COMPONENT;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getSTRING_LIT() {
        return STRING_LIT;
    }

    public void setSTRING_LIT(String STRING_LIT) {
        this.STRING_LIT = STRING_LIT;
    }

    @Override
    public String toString() {
        return "ImportComponent{" +
                "Import='" + Import + '\'' +
                ", COMPONENT='" + COMPONENT + '\'' +
                ", From='" + From + '\'' +
                ", STRING_LIT='" + STRING_LIT + '\'' +
                '}';
    }
}
