import java.time.LocalDate;

public class Personas {

    private int edad;
    private String nombre;
    private LocalDate fechaNacimiento;

    //Metodo constructor 
    //es el que le da la intancia al objeto 

    public Personas (int edad, String nombre, LocalDate fechaNacimiento){
        this.edad = edad;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        // El this es el que le da la instrancia a los atributoss         
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}