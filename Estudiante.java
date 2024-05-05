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

    @Override
    public String toString(){
        return "El nombre del estudiante es: "+ getNombre() +" su edad es: " + getEdad()+"Su fecha de nacimiento es: " + getFechaNacimiento()+ " y por ultimo esta cursando el grado: " + getGrado();

    }
       
}
