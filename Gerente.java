public class Gerente extends Empleados {
    
    private float bono;
    private float horas;
    private float v_horas;
    
    
    public Gerente(String nombre, float salario, float horas, float bono, float horas2, float v_horas) {
        super(nombre, salario, horas);
        this.bono = bono;
        horas = horas2;
        this.v_horas = v_horas;
    }

    
    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }
    public float calcularSalario(){
        return  (horas*v_horas)+bono;
    }
}