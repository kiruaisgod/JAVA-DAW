import java.util.Scanner;
public class PedirDatos{
	public static void main(String[] args){
		//Definicion de variables
		Scanner teclado=new Scanner(System.in);
		String nombre;
		char inicial;
		double radio;
		int numero;
		long distancia;
		float precio;
		double valorCasa;
		boolean condicion;
		
		//Desarrollo del programa
		System.out.println("Introduce un numero entero");
		numero=teclado.nextInt(); //leer un entero
		System.out.println("tu numero es: "+numero);
		
		System.out.println("Dame el radio de la circunferencia");
		radio=teclado.nextDouble(); //leer un double
		System.out.println("La circunferencia tiene el radio: "+radio);
		
		teclado.nextLine();
		System.out.println("Introduzca su nombre");
		nombre=teclado.nextLine(); //leer un string
		System.out.println("Hola, ¿Qué tal "+nombre+"?");
		
		System.out.println("Escribe una palabra cualquiera");
		inicial=teclado.nextLine().charAt(0); //lee un caracter
		System.out.println("La palabra escrita comienza por.....\t"+inicial);
		
		System.out.println("Introduce la distancia entre la tierra y la luna");
		distancia=teclado.nextLong(); //leer un long
		System.out.println("La distancia es: "+distancia);
		
		System.out.println("Introduce cuanto cuesta una barra de pan");
		precio=teclado.nextFloat(); //leer un float
		System.out.println("El precio es: "+precio);
		
		System.out.println("Introduce cuanto cuesta tu casa nueva");
		valorCasa=teclado.nextDouble(); //leer un double
		System.out.println("El precio es: "+valorCasa);
		
		System.out.println("Va a tocar el timbre en breves? (True/False)");
		condicion=teclado.nextBoolean(); //leer un boolean
		System.out.println(condicion);
		
	}
}
