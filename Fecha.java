//dias mes año verificar fecha
import java.util.Scanner;
public class Fecha {
    public static void main(String[] args) {
    
	//Definicion variables
	Scanner teclado = new Scanner(System.in);
	int año=0;
	int mes=0;
	int dia=0;
	
	//Iniciamos el programa.
	
	System.out.println("Introduce el año:");
	año=teclado.nextInt();
	System.out.println("Introduce el mes:");
	mes=teclado.nextInt();
	System.out.println("Introduce el dia:");
	dia=teclado.nextInt();
	
	if(año>=2000 && año<2025){
		switch (mes){
			case 1:
				if(dia > 0 && dia <= 31){
					System.out.println("La fecha es correcta.");
				}
				else{
					System.out.println("La fecha es invalida.");
				}
				break;
			case 2:
				if(dia > 0 && dia <= 28){
					System.out.println("La fecha es correcta.");
				}
				else{
					System.out.println("La fecha es invalida.");
				}
				break;
			case 3:
				if(dia > 0 && dia <= 31){
					System.out.println("La fecha es correcta.");
				}
				else{
					System.out.println("La fecha es invalida.");
				}
				break;
			case 4:
				if(dia > 0 && dia <= 30){
					System.out.println("La fecha es correcta.");
				}
				else{
					System.out.println("La fecha es invalida.");
				}
			case 5:
				if(dia > 0 && dia <= 31){
					System.out.println("La fecha es correcta.");
				}	
				else{
					System.out.println("La fecha es invalida.");
				}
				break;
			case 6:
				if(dia > 0 && dia <= 30){
					System.out.println("La fecha es correcta.");
				}
				else{
					System.out.println("La fecha es invalida.");
				}	
			case 7:
				if(dia > 0 && dia <= 31){
					System.out.println("La fecha es correcta.");
				}	
				else{
					System.out.println("La fecha es invalida.");
				}
				break;
			case 8:
				if(dia > 0 && dia <= 31){
					System.out.println("La fecha es correcta.");
				}	
				else{
					System.out.println("La fecha es invalida.");
				}
			case 9:
				if(dia > 0 && dia <= 30){
					System.out.println("La fecha es correcta.");
				}
				else{
					System.out.println("La fecha es invalida.");
				}
				break;
			case 10:
				if(dia > 0 && dia <= 31){
					System.out.println("La fecha es correcta.");
				}	
				else{
					System.out.println("La fecha es invalida.");
				}
				break;
			case 11:
				if(dia > 0 && dia <= 30){
					System.out.println("La fecha es correcta.");
				}
				else{
					System.out.println("La fecha es invalida.");
				}
				break;
			case 12:
				if(dia > 0 && dia <= 31){
					System.out.println("La fecha es correcta.");
				}
					
				else{
					System.out.println("La fecha es invalida.");
				}
				break;
		}
	}
	else{
		System.out.println("La fecha es invalida.");
	}
}
}
