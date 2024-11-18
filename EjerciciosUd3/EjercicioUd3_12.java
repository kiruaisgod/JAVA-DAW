import java.util.Scanner;
public class EjercicioUd3_11 {
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
	int num=0;
	int binario=0;
	int binario2=0;
	int base=0;
	String resul="";
	System.out.println("Introduce un numero: ");
	num=teclado.nextInt();
	while(num!=0){
		int unidadBinaria=num%2;
		num/=2;
		resul=resul+unidadBinaria;
	}
	System.out.println(resul);
	
	int decimal=0;
	System.out.println("Introduce un numero: ");
	binario2=teclado.nextInt();
	while(binario2!=0){
		int unidadBinaria2=binario%2;
		binario2/=10;
		base*=2;
		decimal=base*unidadBinaria2;
	}
	System.out.println(decimal);
}
}

