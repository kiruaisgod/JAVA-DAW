import java.util.Scanner;
public class Ejercicio2_13 {
    public static void main(String[] args) {
    
    
   	//Ejercicio 3.
   	 
	//Definicion variables.
	Scanner teclado = new Scanner(System.in);
	float kilosPorAnimal=0;
	float comidaDiaria=0;
	float numAnimales=0;
	float mediaComida=0;
	float mediaComida2=0;
	
	//Pedir numeros.
	
	System.out.print("Introduce el numero de comida en KL que dispones: ");
	comidaDiaria=teclado.nextInt();
	System.out.println("-----------------------------------------------------");
	System.out.print("Introduce el numero de Animales: ");
	numAnimales=teclado.nextInt();
	System.out.println("-----------------------------------------------------");
	System.out.print("Introduce el numero de comida que consume cada animal: ");
	kilosPorAnimal=teclado.nextInt();
	
	//Hacer las medias.
	
	mediaComida=kilosPorAnimal*numAnimales;
	
	if(mediaComida<=comidaDiaria){
		System.out.println("Tienes comida suficiente para cada animal.");
	}
	else{
		mediaComida2=comidaDiaria/numAnimales;
		System.out.println("No tienes comida suficiente, debes darle "+mediaComida2+" a cada animal.");
	}
}
}
