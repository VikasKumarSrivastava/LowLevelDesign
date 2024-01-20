package BehavioralPattern_interpreter;

public class MultipleNonTerminalExpression implements AbstractExpression {
	AbstractExpression left;
	AbstractExpression right;
	
	public MultipleNonTerminalExpression(AbstractExpression l,AbstractExpression r) {
		left = l;
		right =r;
	}
	
	@Override
	public int interpret(Context context) {
		return left.interpret(context) * right.interpret(context);
	}
}
