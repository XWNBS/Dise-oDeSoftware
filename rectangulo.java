package PaqueteShape;

public class rectangulo extends Forma {
    private double ancho;
    private double largo;

    public rectangulo(double ancho, double largo, String color, boolean relleno) {
        super(color, relleno);
        this.ancho = ancho;
        this.largo = largo;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public void establecerAncho(double ancho) {
        this.ancho = ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public void establecerLargo(double largo) {
        this.largo = largo;
    }

    public double obtenerArea() {
        return ancho * largo;
    }

    public double obtenerPerimetro() {
        return 2 * (ancho + largo);
    }

    @Override
    public String toString() {
        return "Rectángulo[" + super.toString() + ", ancho=" + ancho + ", largo=" + largo + "]";
    }
}