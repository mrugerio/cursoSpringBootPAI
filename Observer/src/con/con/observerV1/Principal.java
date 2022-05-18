package con.con.observerV1;

public class Principal {

	public static void main(String... args) {
		
		Mouse mouse = new Mouse();

		new Texto("Hello World",mouse);
		new Imagen("Duck",mouse);

		mouse.click();
		
		System.out.println("----------------");
				
		new Gif("Gif",mouse);

		mouse.click();
		
		System.out.println("----------------");

		new Texto("Hola Mundo",mouse);
		mouse.click();
	}

}
