package AST;

import java.util.ArrayList;
import java.util.List;

public class OptionalTypedProperty implements PropertyDeclaration {
    List<String> ID = new ArrayList<>();
    TypeV type;

    public List<String> getID() {
        return ID;
    }

    public void setID(List<String> ID) {
        this.ID = ID;
    }

    public TypeV getType() {
        return type;
    }

    public void setType(TypeV type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TypedAssignedProperty{" +
                "ID='" + ID + '\'' +
                ", type=" + type +
                '}';
    }
}
