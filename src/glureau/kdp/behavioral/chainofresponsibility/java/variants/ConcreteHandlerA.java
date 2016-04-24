package glureau.kdp.behavioral.chainofresponsibility.java.variants;

import java.util.List;

public class ConcreteHandlerA extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request instanceof MyRequestA){
			List<String> params = request.getParameters();
			System.out.println("Request parameters are: " + params.get(0) +
					", " + params.get(1) + ". Chain stops here.");
			return;
		}
		System.out.println("Don't know what to do... yielding the request to "
				+ "the next one in the chain");
		this.successor.handleRequest(request);
	}
}
