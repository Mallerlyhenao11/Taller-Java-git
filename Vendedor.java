public class Vendedor extends Empleados {
    private float comision; 
    private float ventas;
    private float vlrHoras;
    private float horas;    
      
    
    public Vendedor(String nombre, float salario, float comision, float ventas, float vlrHoras, float horas) {
        super(nombre, salario);
        this.comision = comision;
        this.ventas = ventas;
        this.vlrHoras = vlrHoras;
        this.horas = horas;
    }


    public float getComision() {
        return comision;
    }


    public void setComision(float comision) {
        this.comision = comision;
    }


    public float getVentas() {
        return ventas;
    }


    public void setVentas(float ventas) {
        this.ventas = ventas;
    }


    public float getVlrHoras() {
        return vlrHoras;
    }


    public void setVlrHoras(float vlrHoras) {
        this.vlrHoras = vlrHoras;
    }


    public float getHoras() {
        return horas;
    }


    public void setHoras(float horas) {
        this.horas = horas;
    }

    
    
}
