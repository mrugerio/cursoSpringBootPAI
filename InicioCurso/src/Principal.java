
public class Principal {

	public static void main(String[] args) {

		String x = "Hola";
		String z = "Hola";
		String y = "Hola"; //1 
		
		boolean r = y == z;
		
		String v = new String("Hola"); //2
		r = y == v;
		//System.out.println(r);
		
		System.out.println(x.equals(v)); //true
		
		StringBuilder s1 = new StringBuilder("Hola");
		StringBuilder s2 = new StringBuilder("Hola");
		StringBuilder s3 = s2;
		s2.append(" Mundo");
		System.out.println(s3); //"Hola" //"Hola Mundo"
		
		//"Hola Mundo"
		
		System.out.println(s1.equals(s2)); //false
		
		//psecuodigo
		
//		StringBuilder nombre = "Patrobas";
		
//		for (x = 1, hasta 500,000, x++) {
//			nombre.append(x)
//		}
		
		
		

		
		
	}

}
