package AST;

public class AssignStatement implements StatementMethod {
    String ID;
    Expression expression;

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
        return "AssignStatement{" +
                "ID='" + ID + '\'' +
                ", expression=" + expression +
                '}';
    }
}
