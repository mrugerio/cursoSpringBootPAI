package con.con.observerV2;

public class Texto extends Observer {
	
	private String texto;

	public Texto(String texto,Subject subject) {
		super(subject);
		this.texto = texto;
	}
	
	void showText() {
		System.out.println("Mostrar texto: "+texto);
	}

	@Override
	void update() {
		showText();
	}
	
	

}
