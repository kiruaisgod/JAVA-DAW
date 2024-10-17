public class EjercicioRandom {
    public static void main(String[] args) {
        
	// Desarrollo de variables
    int contador;
    
    //Ejercicio 1.
    contador=0;
    while (contador<=24) {
        int num = (int)(Math.random() * 49 + 1);
        System.out.println(num);
        contador++;
    }
    //Ejercicio 2.
    System.out.println(" ");
    contador=0;
    while (contador<=19) {
        int num = (int)(Math.random() * 25 + 1);
        System.out.println(num);
        contador++;
    }
    //Ejercicio 3.
    System.out.println(" ");
    contador=0;
    while (contador<=19) {
        int num = (int)(Math.random() * 25 + 2);
        System.out.println(num);
        contador++;
    }
    //Ejercicio 4.
    System.out.println(" ");
    contador=0;
    while (contador<=9) {
        int num = (int)(Math.random() * 26 + 1);
        System.out.println(num);
        contador++;
    }
    }
}
