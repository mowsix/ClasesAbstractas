public class Circulo extends Figura{

    protected double radio;

    public Circulo(){

    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    protected double calcularArea() {
        double resultado=(3.14)*radio*radio;
        return resultado;
    }
}
