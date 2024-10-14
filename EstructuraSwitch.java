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
		case 5: 
			System.out.println("Eres infantil");
			break;
		case 12: 
			System.out.println("Sigues siendo infantil");
			break;
		case 18: 
			System.out.println("Eres un adulto");
			break;
		case 30: 
			System.out.println("Eres un adulto");
			break;
		case 80: 
			System.out.println("Eres un anciano");
			break;
		default: 
			System.out.println("edad no valida");
	}
}
}
