import java.util.Scanner;
public class EjercicioUd3_11 {
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
	int num=0;
	int binario=0;
	String resul=" ";
	System.out.println("Introduce un numero: ");
	num=teclado.nextInt();
	while(num!=0){
		int unidadBinaria=num%2;
		num/=2;
		resul=resul+unidadBinaria;
	}
	System.out.println(resul);
}
}
