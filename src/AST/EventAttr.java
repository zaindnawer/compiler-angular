package AST;

public class EventAttr implements Attributes{
    String EVENT_BINDING_HTML;
    String STRING_HTML;

    public String getEVENT_BINDING_HTML() {
        return EVENT_BINDING_HTML;
    }

    public void setEVENT_BINDING_HTML(String EVENT_BINDING_HTML) {
        this.EVENT_BINDING_HTML = EVENT_BINDING_HTML;
    }

    public String getSTRING_HTML() {
        return STRING_HTML;
    }

    public void setSTRING_HTML(String STRING_HTML) {
        this.STRING_HTML = STRING_HTML;
    }

    @Override
    public String toString() {
        return "EventAttr{" +
                "EVENT_BINDING_HTML='" + EVENT_BINDING_HTML + '\'' +
                ", STRING_HTML='" + STRING_HTML + '\'' +
                '}';
    }
}
