package AST;

import java.util.ArrayList;
import java.util.List;

public class BodyObject {
    List<Initvalue>initvalues =new ArrayList<>();
    List<String>ID =new ArrayList<>();


    public List<String> getID() {
        return ID;
    }

    public void setID(List<String> ID) {
        this.ID = ID;
    }

    public List<Initvalue> getInitvalues() {
        return initvalues;
    }

    public void setInitvalues(List<Initvalue> initvalues) {
        this.initvalues = initvalues;
    }

    @Override
    public String toString() {
        return "\nBodyObject{" +
                "\n" + initvalues +
                "\n}";
    }
}
