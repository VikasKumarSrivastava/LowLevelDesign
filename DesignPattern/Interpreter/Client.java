package BehavioralPattern_interpreter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		context.put("a", 2);
		context.put("b", 4);
		
		AbstractExpression abs = new MultipleNonTerminalExpression(
				new NumberTerminalExpression("a"),new NumberTerminalExpression("b")
				);
		System.out.println(abs.interpret(context));

	}

}
