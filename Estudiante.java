//mmmmm

import java.time.LocalDate;

public class Estudiante extends Personas {
    
    private String grado;

    
    public Estudiante(int edad, String nombre, LocalDate fechaNacimiento, String grado) {
        super(edad, nombre, fechaNacimiento);
        this.grado = grado; 

    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    
       
}
