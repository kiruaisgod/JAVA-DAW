import java.util.Scanner;
public class Ejercicio5{
	public static void main(String[] args){//Definicion variables
	
	//Ejercicio 5
	//Definicion variables
	Scanner teclado=new Scanner(System.in);
	int nota;
	
	//Pedir una nota y decir su categoria
	
	System.out.println("Introduce una nota: ");
        nota=teclado.nextInt();
	switch (nota){
		
		case 0: 
			
		case 1: 

		case 2: 
		
		case 3: 
		
		case 4: 
			System.out.println("Insuficiente");
			break;
		case 5: 
			System.out.println("Suficiente");
			break;
		case 6: 
			System.out.println("Bien");
			break;
		case 7: 
		
		case 8: 
			System.out.println("Notable");
			break;
		case 9: 
		
		case 10: 
			System.out.println("Sobresaliente");
			break;
		default: 
			System.out.println("nota no valida");
	}
}
}
