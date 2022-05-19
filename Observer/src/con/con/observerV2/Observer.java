package con.con.observerV2;

public abstract class Observer {
	
	Subject subject;
	
	public Observer(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	abstract void update();

}
