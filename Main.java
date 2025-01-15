package com.mycompany.clasesyobjetos;
import java.time.LocalDate;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Estudiantes estudiante = new Estudiantes("Manolo", 20, 8.0);
        
        estudiante.setNombre("Mario");
        estudiante.setEdad(18);
        estudiante.setApellido("Fernandez");
        
        estudiante.mostrar();

        estudiante.resultado(true);
        
        Estudiantes estudiante_2 = new Estudiantes("Oscar",20,4.0);
        
        estudiante_2.setNombre("Oscar");
        estudiante_2.setEdad(20);
        estudiante_2.setApellido("Sanchez");
        estudiante_2.setAprobado(4.0);
        
        estudiante_2.mostrar();
        
        estudiante_2.resultado(true);
    }
}
