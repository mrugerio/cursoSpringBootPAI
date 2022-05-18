package con.con.observerV1;

public class Mouse extends Subject {
	
	public void click() {
		System.out.println("Click mouse");
		notificar();
	}

}
