package TareaEv2_2425.newpackage;
import java.time.LocalDate;
public class Coche {
    String marca;
    String modelo;
    int velocidad;
    String fecha_compra;
    boolean arrancado;
    
    public Coche(String marca, String modelo, int velocidad, int fecha_compra, boolean arrancado){
        this.marca="seat";
        this.modelo="toledo";
        this.velocidad=140;
        this.fecha_compra="2004";
        this.arrancado=true;
    }
    
    public Coche(String marca, String modelo){
        this.marca="seat";
        this.modelo="toledo";
        this.velocidad=140;
        this.fecha_compra="2004";
        this.arrancado=true;
    }
    
    public Coche (){
        this.marca="seat";
        this.modelo="toledo";
        this.fecha_compra="2004";
        this.arrancado=false;
    }
    
    public static void mostrar (){
        System.out.println("Tenemos un coche que necesitamos almacenar la fecha de compra, la velocidad, el modelo, la marca y por uiltimo si esta arrancado o no");
    }
    
    public void isNuevo(){
        int Hoy =LocalDate.now().getYear();
        if(Hoy==this.fecha_compra){
            System.out.println("Tu vehiculo es nuevo");
        }else{
            System.out.println("Tu vehiculo es antiguo");
        }
    }    
    
    public void arrancar(){
        if(velocidad==0){
            this.arrancado=false;
         }else{
            this.arrancado=true;
        }
    }
    
    public void 
    
} //cierre coche


