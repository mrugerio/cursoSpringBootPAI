package con.sin.observer;

public class Principal {

	public static void main(String... args) {
		
		Texto txt = new Texto("Hello World");
		Imagen img = new Imagen("Duck");

		Mouse mouse = new Mouse();
		mouse.txt = txt;
		mouse.img = img;
		mouse.click();
	}

}
