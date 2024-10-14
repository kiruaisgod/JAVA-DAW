import java.util.Scanner;
public class EstructuraSwitch{
	public static void main(String[] args){
	//Definicion variables
	Scanner teclado=new Scanner(System.in);
	int edad;
	String nombre;
	
	//Desarrollo del programa
	
	//Pedimos el nombre al usuario y su edad y evaluamos en que rango de edad se encuentra
	
	
	edad=0;
	nombre=" ";
	
	System.out.println("Buenos dias, ¿como es tu nombre?");
	nombre=teclado.nextLine(); //leer un string
	System.out.println("\nHola, ¿Qué tal "+nombre+"? , ¿cual es tu edad?");
	edad=teclado.nextInt(); //leer un int
	edad=edad-2;
	
	switch (edad){
	case 5: System.out.println("Eres infantil");
	case 12: System.out.println("Sigues siendo infantil");
	case 18: Sysrem.out.println("Eres un adulto");
	case 30: System.out.println("Eres un adulto");
	case 80: System.out.println("Eres un anciano");
	default: System.out.println("edad no valida");
	}
	}
}
