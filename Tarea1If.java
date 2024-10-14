import java.util.Scanner;
public class Tarea1If{
	public static void main(String[] args){
	
	//Ejercicio 1
	//Definicion variables
	Scanner teclado=new Scanner(System.in);
	int numero;
	
	//Pedimos un numero y mostramos si es par o impar
	
	System.out.println("Introduce un número: ");
        numero=teclado.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } 
        else {
            System.out.println("El número " + numero + " es impar.");
        }
	
	//Ejercicio 2
	//Definicion variables
	int numero1;
	int numero2;

	//Pedimos dos numeros y decir si son iguales
	System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } 
        else {
            System.out.println("Los números son diferentes.");
        }
        
        //Ejercicio 3
        //Definicion variables
	int numero3;
	int numero4;

	//Pedimos dos numeros y decir cual es mayor y el menor
	System.out.print("Introduce el primer número: ");
        numero3 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        numero4 = teclado.nextInt();
        
        if (numero3 > numero4) {
            System.out.println("El número mayor es: " + numero3);
            System.out.println("El número menor es: " + numero4);
        } 
        else {
            System.out.println("El número mayor es: " + numero4);
            System.out.println("El número menor es: " + numero3);
        }
        
        //Ejercicio 4
        //Definicion variables
	int numero5;
	int numero6;
	int numero7;
	
	
	
	//Pedir tres numeros y ordenarlos
	
	//Ejercicio 5
	//Definicion variables
	
	int nota;
	
	//Pedir una nota y decir su categoria
	
	System.out.println("Introduce una nota: ");
        nota=teclado.nextInt();
        
	switch(nota){
		
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
