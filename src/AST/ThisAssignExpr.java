package AST;

public class ThisAssignExpr implements StatementMethod {

    String THIS;
    String ID;
    Expression expression;

    public String getTHIS() {
        return THIS;
    }

    public void setTHIS(String THIS) {
        this.THIS = THIS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ThisAssignExpr{" +
                "THIS='" + THIS + '\'' +
                ", ID='" + ID + '\'' +
                ", expression=" + expression +
                '}';
    }
}
