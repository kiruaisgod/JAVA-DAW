import java.util.Scanner;
public class EjercicioUd3_13 {
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	int ss=0;
    	int mm=0;
    	int hh=0;
    	int incremento=0;
    	
    	System.out.print("Introduce la hora actual: ");
	hh=teclado.nextInt();
    	System.out.print("Introduce los minutos actuales: ");
    	mm=teclado.nextInt();
    	System.out.print("Introduce los segundos actuales: ");
    	ss=teclado.nextInt();
    	System.out.print("Introduce los segundos que quieres que se incremente a la hora actual: ");
    	incremento=teclado.nextInt();
    	
    	for(int i=0;i<incremento;i++){
    		ss++;
    		if(ss>=0 && ss<=60){
			if(ss==60){
				mm++;
				ss=0;
			}
		}
		if(mm>=0 && mm<=60){
			if(mm==60){
				hh++;	
				mm=0;
			}
		}
		
		if(hh>=0 && hh<=24){
			if(hh==24){
				hh=0;
			}
		}	
    	}
    	
    	System.out.println("Son las "+hh+":"+mm+":"+ss);
}
}
