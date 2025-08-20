package AST;

import java.util.ArrayList;
import java.util.List;

public class CssElement {
    List<Bodyelement> bodyElements =new ArrayList<>();
    List<String> DOT_CSS = new ArrayList<>();

    public List<String> getDOT_CSS() {
        return DOT_CSS;
    }

    public void setDOT_CSS(List<String> DOT_CSS) {
        this.DOT_CSS = DOT_CSS;
    }

    public List<Bodyelement> getBodyCssElements() {
        return bodyElements;
    }

    public void setBodyCssElements(List<Bodyelement> bodyCssElements) {
        this.bodyElements = bodyCssElements;
    }

    @Override
    public String toString() {
        return "\nCssElement{" +
                "\nbodyElements=" + bodyElements +
                "\n}";
    }
}
