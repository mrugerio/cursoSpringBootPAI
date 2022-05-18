package con.con.observerV1;

public class Principal {

	public static void main(String... args) {
		
		Mouse mouse = new Mouse();

		Texto txt = new Texto("Hello World");
		Imagen img = new Imagen("Duck");

		mouse.attach(txt);
		mouse.attach(img);
		
		mouse.click();
		
		System.out.println("----------------");
		
		mouse.detach(txt);
		mouse.attach(new Gif("Gif"));
		mouse.click();

	}

}
