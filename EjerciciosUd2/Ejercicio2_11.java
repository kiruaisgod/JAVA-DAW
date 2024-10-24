import java.util.Scanner;
public class Ejercicio2_11 {
    public static void main(String[] args) {
    
    
   	//Ejercicio 1.
   	 
	//Definicion variables.
	Scanner teclado = new Scanner(System.in);
	int num=0;
	int mil=0;
	int cien=0;
	int diez=0;
	int uno=0;
	
	do{
		System.out.print("Introduce un numero: ");
		num=teclado.nextInt();
	}while(num<=0 && num>=9999);
	
	//Descomponer numeros.
	
	uno=num%10;
	diez=num%100;
	diez=diez/10;
	cien=num%1000;
	cien=cien/100;
	mil=num/1000;
	
	if(num>=1000 && num<=9999){
		if(mil==uno){
			if(cien==diez){	
				System.out.println("El numero es capicuo");
			}
			else{
				System.out.println("El numero no es capicuo");
			}
		}	
	}
	
	if(num>=100 && num<=999){
		if(cien==uno){	
			System.out.println("El numero es capicuo");
		}
		else{
			System.out.println("El numero no es capicuo");
		}	
	}

}
}
