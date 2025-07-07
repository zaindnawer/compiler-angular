package AST;

public class ExprStatement implements StatementMethod{
    Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ExprStatement{" +
                "expression=" + expression +
                '}';
    }
}
