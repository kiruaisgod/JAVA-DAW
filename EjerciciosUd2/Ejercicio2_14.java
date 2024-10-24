import java.util.Scanner;
public class Ejercicio2_14 {
    public static void main(String[] args) {
    
    
   	//Ejercicio 4.
   	 
	//Definicion variables.
	Scanner teclado = new Scanner(System.in);
	int num=0;
	int decimal=0;
	int unidad=0;
	String primero="cero";
	String segundo="segundo";
	String excepcion="hola";
	
	do{
		System.out.println("Introduce un numero del 1 al 99.");
		num=teclado.nextInt();
	}while(num<1 && num>99);
	
	decimal=num/10;	
	unidad=num%10;
	
	if(num==10 || num==11 || num==12 || num==13 || num==14 || num==15 || num==20 || num==30 || num==40 || num==50 || num==60 || num==70 || num==80 || num==90){
		switch(num){
	
		case 10:  
			excepcion="diez";
			break;
		case 11:
			excepcion="once";
			break;
		case 12:
			excepcion="doce";
			break;
		case 13:
			excepcion="trece";
			break;
		case 14:
			excepcion="catorce";
			break;
		case 15: 
			excepcion="quince";
			break;
		case 20:
			excepcion="veinte";
			break;
		case 30:
			excepcion="treinta";
			break;
		case 40:
			primero="cuarenta";
			break;
		case 50:
			primero="cincuenta";
			break;
		case 60:
			excepcion="sesenta";
			break;
		case 70:
			excepcion="setenta";
			break;
		case 80:
			excepcion="ochenta";
			break;
		case 90:
			excepcion="noventa";
			break;
		}
	}
	else{
	
		switch(decimal){
	
		case 0:  
			primero=" ";
			break;
		case 1:
			primero="dieci";
			break;
		case 2:
			primero="veinti";
			break;
		case 3:
			primero="treinta y ";
			break;
		case 4:
			primero="cuarenta y ";
			break;
		case 5: 
			primero="cincuenta y ";
			break;
		case 6:
			primero="sesenta y ";
			break;
		case 7:
			primero="setenta y ";
			break;
		case 8:
			primero="ochenta y ";
			break;
		case 9:
			primero="noventa y ";
			break;
		}
	
		switch(unidad){
	
		case 1:
			segundo="uno";
			break;
		case 2:
			segundo="dos";
			break;
		case 3:
			segundo="tres";
			break;
		case 4:
			segundo="cuatro";
			break;
		case 5: 
			segundo="cinco";
			break;
		case 6:
			segundo="seis";
			break;
		case 7:
			segundo="siete";
			break;
		case 8:
			segundo="ocho";
			break;
		case 9:
			segundo="nueve";
			break;
		}
	}
	
	if(num==10 || num==11 || num==12 || num==13 || num==14 || num==15 || num==20 || num==30 || num==40 || num==50 || num==60 || num==70 || num==80 || num==90){
		
		System.out.println(excepcion);
	}
	else{
		if(num>=10 && num<=99){
			System.out.println(primero+segundo);
		}else{
			System.out.println(segundo);
		}
	}
}
}
