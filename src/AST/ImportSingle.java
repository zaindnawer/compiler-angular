package AST;

public class ImportSingle implements ImportDeclaration{

    String Import;
    String ID;
    String From;
    String STRING_LIT;

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
        return "ImportSingle{" +
                "Import='" + Import + '\'' +
                ", ID='" + ID + '\'' +
                ", From='" + From + '\'' +
                ", STRING_LIT='" + STRING_LIT + '\'' +
                '}';
    }
}
