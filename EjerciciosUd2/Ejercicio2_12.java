import java.util.Scanner;
public class Ejercicio2_12 {
    public static void main(String[] args) {
    
	//Ejercicio 2.
	
	//Definicion variables.
	Scanner teclado = new Scanner(System.in);
	int ult=0;
	int DNI=0;
	
	//Leer numero.
	
	do{
		System.out.println("Introduce los 8 digitos de tú DNI");
		DNI=teclado.nextInt();
	}while(DNI<=10000000 && DNI>=99999999);
	
	//Calcular resto.
	
	ult=DNI%23;
	
	switch (ult){
	
	case 0:
		System.out.println("Tu DNI sería: "+DNI+"T");
		break;
	case 1:
		System.out.println("Tu DNI sería: "+DNI+"R");
		break;
	case 2:
		System.out.println("Tu DNI sería: "+DNI+"W");
		break;
	case 3:
		System.out.println("Tu DNI sería: "+DNI+"A");
		break;
	case 4:
		System.out.println("Tu DNI sería: "+DNI+"G");
		break;
	case 5:
		System.out.println("Tu DNI sería: "+DNI+"M");
		break;
	case 6:
		System.out.println("Tu DNI sería: "+DNI+"Y");
		break;
	case 7:
		System.out.println("Tu DNI sería: "+DNI+"F");
		break;
	case 8:
		System.out.println("Tu DNI sería: "+DNI+"P");
		break;
	case 9:
		System.out.println("Tu DNI sería: "+DNI+"D");
		break;
	case 10:
		System.out.println("Tu DNI sería: "+DNI+"X");
		break;
	case 11:
		System.out.println("Tu DNI sería: "+DNI+"B");
		break;
	case 12:
		System.out.println("Tu DNI sería: "+DNI+"N");
		break;
	case 13:
		System.out.println("Tu DNI sería: "+DNI+"J");
		break;
	case 14:
		System.out.println("Tu DNI sería: "+DNI+"Z");
		break;
	case 15:
		System.out.println("Tu DNI sería: "+DNI+"S");
		break;
	case 16:
		System.out.println("Tu DNI sería: "+DNI+"Q");
		break;
	case 17:
		System.out.println("Tu DNI sería: "+DNI+"V");
		break;
	case 18:
		System.out.println("Tu DNI sería: "+DNI+"H");
		break;
	case 19:
		System.out.println("Tu DNI sería: "+DNI+"L");
		break;
	case 20:
		System.out.println("Tu DNI sería: "+DNI+"C");
		break;
	case 21:
		System.out.println("Tu DNI sería: "+DNI+"K");
		break;
	case 22:
		System.out.println("Tu DNI sería: "+DNI+"E");
		break;
	
	}
}
}
