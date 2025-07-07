package AST;

public class SelfTag implements Tag{
    SelfClosingTag selfClosingTag;

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    @Override
    public String toString() {
        return "SelfTag{" +
                "selfClosingTag=" + selfClosingTag +
                '}';
    }
}
