package con.con.observerV1;

public abstract class Observer {
	
	Subject subject;
	
	public Observer(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	abstract void update();

}
