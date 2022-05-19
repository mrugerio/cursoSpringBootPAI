package con.con.observerV2;

public class Principal {

	public static void main(String... args) {
		
		System.out.println("Observer V2");
	
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
