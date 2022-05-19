package con.curso.observerV2;

public class Mouse extends Subject {
	
	public void click() {
		System.out.println("Click mouse");
		notificar();
	}

}
