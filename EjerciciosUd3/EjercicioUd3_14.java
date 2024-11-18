import java.util.Scanner;
public class EjercicioUd3_14 {
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	int num=0;
    	int primo=0;
    	
    	System.out.println("Introduce un numero: ");
    	num=teclado.nextInt();
    	for(int i=2;i<=num;i++){
    		int j=2;
    		boolean esPrimo=true;
    		while(j<i && esPrimo){
    			if(i%j==0){
    				esPrimo=false;
    			}
    		}
    	}
    	System.out.println("Hay "+primo+" numeros primos.");    			
}
}
