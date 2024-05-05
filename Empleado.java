import java.time.LocalDate;

public class Empleado extends Personas {
    
    public Empleado (int edad, String nombre, LocalDate fechaNacimiento, String grado) {
        super(edad, nombre, fechaNacimiento);
    }
}
