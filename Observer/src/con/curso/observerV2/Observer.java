package con.curso.observerV2;

public abstract class Observer {
	
	Subject subject;
	
	public Observer(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	abstract void update();

}
