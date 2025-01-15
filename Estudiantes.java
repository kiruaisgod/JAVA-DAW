
package com.mycompany.clasesyobjetos;

import java.time.LocalDate;

public class Estudiantes {
    String nombre;
    String apellido;
    double aprobado;
    int edad;
    
    public Estudiantes(String nombre, int edad, double aprobado){
        this.nombre="Manolo";
        this.apellido="Gonzalez";
        this.edad=20;
        this.aprobado=8.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAprobado() {
        return aprobado;
    }

    public void setAprobado(double aprobado) {
        this.aprobado = aprobado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrar (){
        System.out.println("El alumno "+nombre+" "+apellido+" con edad de "+edad+" años");
    }

    public boolean resultado (boolean resultado){
        if(aprobado>=6.0){
            System.out.println("Ha superado la nota");
            resultado=true;
        }else{
            System.out.println("No ha superado la nota");
            resultado=false;
        }
        return resultado;
    }
}
 