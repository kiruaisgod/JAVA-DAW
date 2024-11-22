package unidad3;
import java.util.Scanner;
public class Unidad3 {
    public static void main (String[] args){
        Scanner teclado=new Scanner(System.in);
        int valor;
        System.out.println("Vamos a llamar a mi primer metodo");
        valor=teclado.nextInt();
        eco(valor); //LLamamos al metodo con el parametro "valor".
        System.out.println(" ");
        System.out.println("Vamos a llamar a mi segundo metodo");
        mostrar(1,1);
        System.out.println("Vamos a llamar a mi tercer metodo");
        calcular(1);
        System.out.println("Vamos a llamar a mi cuarto metodo");
        mayor(1,1);
        System.out.println("Vamos a llamar a mi quinto metodo");
        menor(1,1);
    } 
    public static void eco(int num) {
        for(int i=0;i<num;i++){
        System.out.print("eco ");
        }
    }
    
    public static void mostrar (int a, int b){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        a=teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        b=teclado.nextInt();
        if(a<b){
            for(int i=a;i<=b;i++){
                System.out.println(i);
            } 
        }else{
            for(int i=b;i<=a;i++){
                System.out.println(i);
            } 
        } 
    }
    
    public static void calcular (int radio){
        Scanner teclado=new Scanner(System.in);
        final float pi=3.1415f;
        System.out.println("Introduce el radio: ");
        radio=teclado.nextInt();
        System.out.println("Introduce la altura: ");
        int altura=teclado.nextInt();
        float area=(pi*(radio*radio));
        System.out.println("El area es: "+area);
        float volumen=(pi*(radio*radio)*altura);
        System.out.println("El volumen es: "+volumen);
    }
    
    public static void mayor (int a, int b){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        a=teclado.nextInt();
        System.out.print("Introduce otro numero: ");
        b=teclado.nextInt();
        
        if(a>b){
            System.out.println(a+" es mayor que "+b);
        }else{
            System.out.println(b+" es mayor que "+a);
        }
    }
        
    public static void menor (int a, int b){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        a=teclado.nextInt();
        System.out.print("Introduce otro numero: ");
        b=teclado.nextInt();
        int menor = (a < b) ? a : b;
         System.out.println("El numero menor es "+menor);
    }
}
