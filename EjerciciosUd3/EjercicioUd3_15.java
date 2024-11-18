import java.util.Scanner;
public class EjercicioUd3_15 {
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	int num=0;
    	System.out.println("Introduce un numero: ");
    	num=teclado.nextInt();
	
	for(int fila=0;fila<num;fila++){
		for(int elemento=0;elemento<=fila;elemento++){
			int factNum=1;
			for(int i=1;i<=fila;i++){
				factNum*=i;
			}
			int factM=1;
			for(int i=1;i<=elemento;i++){
				factM*=i;
			}
			int factNumMenosM=1;
			for(int i=1;i<=fila-elemento;i++){
				factNumMenosM*=i;	
			}
			int valor=factNum/(factM*factNumMenosM);
			System.out.print(valor+" ");
		}
		System.out.println("");
	}						
}
}
