package glureau.kdp.mediator;

public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(String name, Mediator mediator){
		this.name = name;
		this.mediator = mediator;
	}
	
	@Override
	public void introduceEveryone(){
		broadcastUpdate();
	}
	
	private void broadcastUpdate(){
		mediator.broadcastGreet();
	}
}
