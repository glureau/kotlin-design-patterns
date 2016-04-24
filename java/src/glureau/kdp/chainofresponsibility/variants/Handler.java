package glureau.kdp.chainofresponsibility.variants;

public abstract class Handler {

	protected Handler successor;
	
	public void setSuccessor(Handler handler){
		this.successor = handler;
	}
	
	public abstract void handleRequest(Request request);
}
