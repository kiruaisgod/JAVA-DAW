import java.util.Scanner;
public class Ecuaciones {
    public static void main(String[] args) {
    
	//Definicion variables
	
	Scanner teclado = new Scanner(System.in);
	float a=0;
	float b=0;
	float c=0;
	float raiz=0;
	float div=0;
	float resulneg=0;
	float resulpos=0;
	
	System.out.println("Voy a necesitar tres numeros para esta ecuación: ax2+bx+c=0");
	System.out.print("Introduce el numero a: ");
	a=teclado.nextFloat();
	System.out.print("Introduce el numero b: ");
	b=teclado.nextFloat();
	System.out.print("Introduce el numero c: ");
	c=teclado.nextFloat();
	
	div= 2*a;
	raiz=(b*b) + (4*a*c);
	
	if(div !=  0 && raiz >= 0){
		resulpos= (float) (b + Math.sqrt(raiz)) /div;
		System.out.println("El resultado positivo de la ecuación es:");
		System.out.println(resulpos);
		resulneg= (float) (b - Math.sqrt(raiz)) /div;
		System.out.println("El resultado negativo de la ecuación es:");
		System.out.println(resulneg);
	}
	else{
		System.out.println("La ecuacion no tiene solución.");
	}
}
}
	
	
//ax2+bx+c=0
