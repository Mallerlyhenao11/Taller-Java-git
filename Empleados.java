public class Empleados {
    private String nombre;
    private float salario;
    private float horas;
    
    public Empleados(String nombre, float salario, float horas) {
        this.nombre = nombre;
        this.salario = salario;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getHoras() {
        return horas;
    }
    public void setHoras(float horas) {
        this.horas = horas;
    }
    
}
