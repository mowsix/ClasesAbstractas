public abstract class Figura {
    protected double X, Y;

    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.X=x;
        this.Y=y;
    }

    protected abstract double calcularArea();
}
