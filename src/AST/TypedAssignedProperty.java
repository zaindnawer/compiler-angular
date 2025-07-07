package AST;


public class TypedAssignedProperty implements PropertyDeclaration {
    String ID;
    TypeV type;
    Initvalue initvalue;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public TypeV getType() {
        return type;
    }

    public void setType(TypeV type) {
        this.type = type;
    }

    public Initvalue getInitvalue() {
        return initvalue;
    }

    public void setInitvalue(Initvalue initvalue) {
        this.initvalue = initvalue;
    }

    @Override
    public String toString() {
        return "TypedAssignedProperty{" +
                "ID='" + ID + '\'' +
                ", type=" + type +
                ", initvalue=" + initvalue +
                '}';
    }
}
