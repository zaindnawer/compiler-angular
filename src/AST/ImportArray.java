package AST;

public class ImportArray implements ImportDeclaration{
    String Imports;
    String ID;

    public String getImports() {
        return Imports;
    }

    public void setImports(String imports) {
        Imports = imports;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        stringBuilder.append(Imports);
        if (ID != null){
            stringBuilder.append(ID);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
