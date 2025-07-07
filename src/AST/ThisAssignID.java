package AST;

import java.util.ArrayList;
import java.util.List;

public class ThisAssignID implements StatementMethod {
    String THIS;
    List<String> ID = new ArrayList<>();

    public String getTHIS() {
        return THIS;
    }

    public void setTHIS(String THIS) {
        this.THIS = THIS;
    }

    public List<String> getID() {
        return ID;
    }

    public void setID(List<String> ID) {
        this.ID = ID;
    }
    @Override
    public String toString() {
        return "ThisAssignID{" +
                "THIS='" + THIS + '\'' +
                ", ID=" + ID +
                '}';
    }
}
