package con.curso.observerV1;

public class Gif extends Observer {
	
	private String gif;

	public Gif(String gif) {
		this.gif = gif;
	}
	
	void moveGif() {
		System.out.println("Mover gif: "+gif);
	}

	@Override
	void update() {
		moveGif();
	}
	
	

}
