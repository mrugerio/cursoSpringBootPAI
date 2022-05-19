package con.curso.observerV1;

public class Imagen extends Observer {
	
	private String img;

	public Imagen(String img) {
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
