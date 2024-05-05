import java.time.LocalDate;

public class Empleado extends Personas implements Trabajador {
    
    public Empleado (int edad, String nombre, LocalDate fechaNacimiento, String grado) {
        super(edad, nombre, fechaNacimiento);
    }

    public void realizarTarea (){
        System.out.println("Realizando tarea Laboral");
    }

}
