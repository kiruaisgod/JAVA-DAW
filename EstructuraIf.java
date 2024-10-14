import java.util.Scanner;
public class EstructuraIf{
	public static void main(String[] args){
	//Definicion variables
	Scanner teclado=new Scanner(System.in);
	int numero;
	String nombre;
	int banco;
	
	//Desarrollo del programa
	
	//Pedimos el nombre al usuario y un nº si es mayor que 100, somos ricos si no pobres
	
	
	numero=0;
	nombre=" ";
	banco=0;
	
	System.out.println("Buenos dias, ¿como es tu nombre?");
	nombre=teclado.nextLine(); //leer un string
	System.out.println("\nHola, ¿Qué tal "+nombre+"? , ¿como esta tu economia?\t¿Cuantos euros llevas encima?");
	numero=teclado.nextInt(); //leer un int
	
	if(numero<100){
		System.out.println("Eres pobre");
	}
	else{ 
		System.out.println("Eres Rico");
	}
	
	System.out.println("\n¿Cuanto tienes en el banco?");
	banco=teclado.nextInt(); //leer un int
	String mensaje = (banco >= 1000) ? "Eres Rico." : "Eres Pobre.";
	System.out.println(mensaje);
	
	if((numero>100)&&(banco>1000)){
		System.out.println("Eres rico, tienes mucho dinero");
	}
	else{ 
		System.out.println("Eres pobre, ponte a trabajar");
	}
	}
}
