import java.util.Scanner;
public class RangoNumero {
    public static void main(String[] args) {
    
	//Definicion variables
	
	Scanner teclado = new Scanner(System.in);
	int num;

	System.out.print("Dime un numero del 0 - 99999: ");
	num=teclado.nextInt();		
	if(num>=0 && num<=99999){
		if(num>=0 && num<=10){
			System.out.println("Tu numero tiene un digito.");
		}
			if(num>=10 && num<100){
				System.out.println("Tu numero tiene dos digitos.");
			}
				if(num>=100 && num<1000){
					System.out.println("Tu numero tiene tres digitos.");
				}
					if(num>=1000 && num<10000){
						System.out.println("Tu numero tiene cuatro digitos.");
					}
						if(num>=10000 && num<=99999){
							System.out.println("Tu numero tiene cinco digitos.");
						}
	}
	else{
		System.out.println("Numero no esta en el rango");
	}
}
}
