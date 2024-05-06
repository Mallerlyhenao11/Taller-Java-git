public class Gerente extends Empleados {

    private float bono;
    private float horas;
    private float vlrHoras;
    
 
    public Gerente(String nombre, float salario, float bono, float horas, float vlrHoras) {
        super(nombre, salario);
        this.bono = bono;
        this.horas = horas;
        this.vlrHoras = vlrHoras;
    }
    
    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public float getVlrHoras() {
        return vlrHoras;
    }

    public void setVlrHoras(float vlrHoras) {
        this.vlrHoras = vlrHoras;
    }

    public float calcularSalario (){
        return this.vlrHoras * this.horas;
    }

    
}
