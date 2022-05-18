package con.sin.observer;

public class Mouse {
	
	Texto txt;
	Imagen img;
	
	public void click() {
		System.out.println("Click mouse");
		txt.showText();
		img.showImage();
		
	}

}
