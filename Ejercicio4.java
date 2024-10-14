import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        
	//Ejercicio 4
	//Definicion variables
	
	Scanner teclado = new Scanner(System.in);
	int mayor; 
	int medio; 
	int menor;
	int num1;	
	int num2;
	int num3;
	
	//Pedir tres numeros y ordenarlos de mayor a menor	

        System.out.println("Introduce un número: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro número: ");
        num2 = teclado.nextInt();
        System.out.println("Introduce el tercer número: ");
        num3 = teclado.nextInt();
             
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        }
         else {
            if (num2 >= num1 && num2 >= num3) {
                mayor = num2;
                if (num1 >= num3) {
                    medio = num1;
                    menor = num3;
                } else {
                    medio = num3;
                    menor = num1;
                }
            }
             else {
                mayor = num3;
                if (num1 >= num2) {
                    medio = num1;
                    menor = num2;
                } 
                else {
                    medio = num2;
                    menor = num1;
                }
            }
        }
	System.out.println("Números ordenados de mayor a menor son " + mayor + ", " + medio + ", " + menor);
    }
}
