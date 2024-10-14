import java.util.Scanner;
public class Adivinador {
    public static void main(String[] args) {
    
	//Definicion variables
	
	Scanner teclado = new Scanner(System.in);
	int num;
	int contador;
	int respuesta;
	
	System.out.println("Vamos a jugar a un juego, consiste en que tendrás que adivinar mi número favorito que está entre el 1 y el 25. ¿Serás capaz con 3 intentos?");
	
	num=13;
	contador=0;
	respuesta=0;
	
	while (contador!=3 && num!=respuesta){
		System.out.println("¿Mi numero es?");
		respuesta=teclado.nextInt();
		contador++;
		if(respuesta<25){
			if(respuesta!=num){
				System.out.println("Has fallado");
				if (respuesta>num){
					System.out.println("Pista: Tu intento es mayor que mi numero");
				}
				else{
					System.out.println("Pista: Tu intento es menor que mi numero");
				}
			}
			else{
				System.out.println("Has acertador al "+contador);
			}
		}
		else{
			System.out.println("Deber ser entre 1 y 25");
		}	
	}
}
}

