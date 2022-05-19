package con.curso.observerV2;

public class Gif extends Observer {
	
	private String gif;

	public Gif(String gif, Subject subject) {
		super(subject);
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
