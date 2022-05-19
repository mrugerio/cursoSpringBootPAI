package con.curso.observerV1;

public class Principal {

	public static void main(String... args) {
		
		System.out.println("Observer V1");
		
		Mouse mouse = new Mouse();

		Texto texto = new Texto("Hello World");
		Imagen img = new Imagen("Duck");
		
		mouse.attach(texto);
		mouse.attach(img);

		mouse.click();
		
		System.out.println("----------------");
				
		Gif gif = new Gif("Gif");
		mouse.attach(gif);
		mouse.detach(img);

		mouse.click();
		
		System.out.println("----------------");

		Texto otroTexto = new Texto("Hola Mundo");
		mouse.attach(otroTexto);
		mouse.click();
	}

}
