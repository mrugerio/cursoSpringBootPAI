package con.con.observerV1;

public class Texto extends Observer {
	
	private String texto;

	public Texto(String texto) {
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
