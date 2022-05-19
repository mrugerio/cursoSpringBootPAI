package con.curso.observerV2;

public class Imagen extends Observer {
	
	private String img;

	public Imagen(String img, Subject subject) {
		super(subject);
		this.img = img;
	}
	
	void showImage() {
		System.out.println("Mostrar imagen: "+img);
	}

	@Override
	void update() {
		showImage();
	}
	
	

}
