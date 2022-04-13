package study.InterpreterPattern.code0;

public class MinusExpression implements Expression{

    String data = "-";

    @Override
    public boolean interprete(String context) {
        if(context.contains(data)){
            return true;
        } else {
            return false;
        }
    }
}
