package sj.patterns.interpreter;


interface Expression {
    Integer interprete() throws ArithmeticException;
}

class NumberExpression implements Expression {
    private final Integer value;

    public NumberExpression(Integer value) {
        this.value = value;
    }

    @Override
    public Integer interprete() {
        return value;
    }
}

class AdditionExpression implements Expression {
    private final Expression left, right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interprete() throws ArithmeticException {
        return left.interprete() + right.interprete();
    }
}

class SubtractionExpression implements Expression {
    private final Expression left, right;

    public SubtractionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interprete() throws ArithmeticException {
        return left.interprete() - right.interprete();
    }
}

class DivisionExpression implements Expression {
    private final Expression left, right;

    public DivisionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interprete() throws ArithmeticException {
        return left.interprete() / right.interprete();
    }
}

class MultiplicationExpression implements Expression {
    private final Expression left, right;

    public MultiplicationExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interprete() throws ArithmeticException {
        return left.interprete() * right.interprete();
    }
}


public class Interpreter {
    public static void main(String[] args) {

        // 2 + 10 * 3 - 2 / 2 = 15
        Expression expression = new DivisionExpression(
                new SubtractionExpression(
                        new AdditionExpression(
                                new NumberExpression(2),
                                new MultiplicationExpression(
                                        new NumberExpression(10),
                                        new NumberExpression(3)
                                )
                        ), new NumberExpression(2)
                ), new NumberExpression(2)
        );

        try {
            System.out.println(expression.interprete());
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

