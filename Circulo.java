public class Circulo extends FigurasGeometricas {

    private Float pi;
    private Float radio;
    
  
    public Circulo(String nombre, String color, Float pi, Float radio) {
        super(nombre, color);
        this.pi = pi;
        this.radio = radio;
    }
    public Float getPi() {
        return pi;
    }
    public void setPi(Float pi) {
        this.pi = pi;
    }
    public Float getRadio() {
        return radio;
    }
    public void setRadio(Float radio) {
        this.radio = radio;
    }
    public float calcularPerimetro(){
        return (2*pi)*radio;
    }
    public float calcularArea(){
        return pi*(radio*radio);
    }
    
}