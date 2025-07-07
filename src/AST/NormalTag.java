package AST;

import java.util.ArrayList;
import java.util.List;

public class NormalTag implements Tag{
    OpeningTag openingTag;
    List<Element> element = new ArrayList<>();
    ClosingTag closingTag;

    public OpeningTag getOpeningTag() {
        return openingTag;
    }

    public void setOpeningTag(OpeningTag openingTag) {
        this.openingTag = openingTag;
    }

    public List<Element> getElement() {
        return element;
    }

    public void setElement(List<Element> element) {
        this.element = element;
    }

    public ClosingTag getClosingTag() {
        return closingTag;
    }

    public void setClosingTag(ClosingTag closingTag) {
        this.closingTag = closingTag;
    }

    @Override
    public String toString() {
        return "NormalTag{" +
                "openingTag=" + openingTag +
                ", element=" + element +
                ", closingTag=" + closingTag +
                '}';
    }
}
