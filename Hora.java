import java.util.Scanner;
public class Hora {
    public static void main(String[] args) {
    
	//Definicion variables
	Scanner teclado = new Scanner(System.in);
	int hh=0;
	int mm=0;
	int ss=0;
	
	//Iniciamos el programa.
	
	do{
		System.out.println("Introduce la hora actual:");
		hh=teclado.nextInt();
	}while(hh<=0 && hh>=23);
		
	do{	
		System.out.println("Introduce los minutos actuales:");
		mm=teclado.nextInt();
	}while(mm<=0 && mm>=59);
	
	do{
		System.out.println("Introduce los segundos actuales:");
		ss=teclado.nextInt();
	}while (ss<=0 && ss>=59);
	
	if(ss>=0 && ss<=59){
		ss++;
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
	
	if(hh>=0 && hh>=24){
		if(hh==24){
			hh=0;
		}
	}
	
	System.out.println("La hora actual seria "+hh+":"+mm+":"+ss);		
		
}
}
