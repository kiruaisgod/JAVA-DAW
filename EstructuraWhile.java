import java.util.Scanner;
public class EstructuraWhile{
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
    	int numero=1, edad=5, contador=0;
    	
    	while(numero<20){
    	System.out.println(numero);
    	numero++;
    	contador+=1;
    	}
    	
    	System.out.println("Tenemos un total de " +contador+" numeros");
    
    
    numero=1;
    contador=0;
    do{
    	System.out.println("Dame la edad del alumno nº "+numero+ " de 1º DAW\t\t");
    	edad=teclado.nextInt();
    	if(edad>=18){
    		contador+=1;
    	}
    	numero++;
    }while(numero<=10);
    System.out.println("En 1DAW tenemos mayores de edad " +contador);
    
    }
}
