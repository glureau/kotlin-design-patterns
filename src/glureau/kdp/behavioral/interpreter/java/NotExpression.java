package glureau.kdp.behavioral.interpreter.java;

public class NotExpression implements AbstractExpression {

	AbstractExpression operand;
	
	public NotExpression(AbstractExpression operand) {
		this.operand = operand;
	}
	
	@Override
	public boolean interpret(Context context) {
		return !operand.interpret(context);
	}
}
