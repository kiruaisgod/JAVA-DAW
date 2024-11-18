import java.util.Scanner;
public class EjercicioUd3_16 {
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	int num=0;
    	System.out.println("Introduce un numero: ");
    	num=teclado.nextInt();
	
	for(int fila=1;fila<=num;fila++){
		for(int espacios=0;espacios<=num-fila;espacios++){
			System.out.print(" ");
		}	
		
		for(int asteriscos=1;asteriscos<=fila;asteriscos++){
			System.out.print("* ");
		}
		System.out.println("");
	}						
}
}
