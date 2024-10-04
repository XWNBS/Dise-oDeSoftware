package PaqueteShape;

public class circulo extends Forma {
    private double radio;

    public circulo(double radio, String color, boolean relleno) {
        super(color, relleno);
        this.radio = radio;
    }

    public double obtenerRadio() {
        return radio;
    }

    public void establecerRadio(double radio) {
        this.radio = radio;
    }

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Círculo[" + super.toString() + ", radio=" + radio + "]";
    }
}


