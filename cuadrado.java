package PaqueteShape;

public class cuadrado extends rectangulo {
    public cuadrado(double lado, String color, boolean relleno) {
        super(lado, lado, color, relleno);
    }

    public double obtenerLado() {
        return obtenerAncho();
    }

    public void establecerLado(double lado) {
        super.establecerAncho(lado);
        super.establecerLargo(lado);
    }

    @Override
    public void establecerAncho(double ancho) {
        establecerLado(ancho);
    }

    @Override
    public void establecerLargo(double largo) {
        establecerLado(largo);
    }

    @Override
    public String toString() {
        return "Cuadrado[" + super.toString().replace("Rectángulo", "Forma") + "]";
    }
}