import java.util.Scanner;
public class Ejercicio2_15 {
    public static void main(String[] args) {
    
    
   	//Ejercicio 4.
   	 
	//Definicion variables.
	Scanner teclado = new Scanner(System.in);
	float num1=0;
	float num2=0;
	float area=0;
	
	System.out.println("Introduce la base del triangulo.");
	num1=teclado.nextFloat();
	System.out.println("Introduce la altura del triangulo.");
	num2=teclado.nextFloat();
	
	if(num1>0 && num2>0){
		area=(num1*num2)/2;
		System.out.println("El area es de "+area+"cm²");
	}else{
		System.out.println("No se puede calcular.");
	}
}
}
