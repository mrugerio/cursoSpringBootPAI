package con.sin.observer;

public class Principal {

	public static void main(String... args) {
		
		System.out.println("Sin Observer");
		
		Texto txt = new Texto("Hello World");
		Imagen img = new Imagen("Duck");
		Gif gif = new Gif("Gif");

		Mouse mouse = new Mouse();
		mouse.txt = txt;
		mouse.img = img;
		mouse.gif = gif;
		mouse.click();
	}

}
