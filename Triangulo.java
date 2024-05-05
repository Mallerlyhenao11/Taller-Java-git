public class Triangulo  extends FigurasGeometricas {

    private Float base;
    private Float altura;

    
    public Triangulo(String nombre, String color, Float base, Float altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    
    public Float getBase() {
        return base;
    }
    public void setBase(Float base) {
        this.base = base;
    }
    public Float getAltura() {
        return altura;
    }
    public void setAltura(Float altura) {
        this.altura = altura;
    }
    public float calcularArea(){
        return this.base * this.altura;
    }
    public float calcularPerimetro(){
        return this.altura + this.base + this.altura;

    }

}