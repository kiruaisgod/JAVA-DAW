import java.util.Scanner;
public class EstructuraFor{
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
    	int inicio, contador=0;
	//Utilizar una iterativa para mostrar los numeros del 1 al 20.
	for(int i=1;i<=20;i++){
		System.out.println(i);
	}
	
	System.out.println ("Dame el numero de partida");
	inicio=teclado.nextInt();
	for(int i=inicio;i<=20;i++){
		System.out.println(i);
		contador++;
	}
	System.out.println("En total desde el "+inicio+" al 20 tenemos "+contador+" numeros");
	
    }
}

