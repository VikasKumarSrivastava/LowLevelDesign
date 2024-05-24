package BehavioralPattern_interpreter;
public class NumberTerminalExpression implements AbstractExpression {
	String str;
	NumberTerminalExpression(String s){
		str=s;
	}
	@Override
	public int interpret(Context context) {
		return context.get(str);
	}

}
