package PaqueteShape;

public class DemoShape {
    public static void main(String[] args) {
        circulo miCirculo = new circulo(5.0, "rojo", true);
        cuadrado miCuadrado = new cuadrado(4.0, "azul", false);
        rectangulo miRectangulo = new rectangulo(3.0, 6.0, "verde", true);

        System.out.println("Círculo:");
        System.out.println(miCirculo);
        System.out.println("Área: " + miCirculo.obtenerArea());
        System.out.println("Perímetro: " + miCirculo.obtenerPerimetro());
        System.out.println();

        System.out.println("Cuadrado:");
        System.out.println(miCuadrado);
        System.out.println("Área: " + miCuadrado.obtenerArea());
        System.out.println("Perímetro: " + miCuadrado.obtenerPerimetro());
        System.out.println();
        
        System.out.println("Rectángulo:");
        System.out.println(miRectangulo);
        System.out.println("Área: " + miRectangulo.obtenerArea());
        System.out.println("Perímetro: " + miRectangulo.obtenerPerimetro());
        System.out.println();

        miCirculo.establecerRadio(7.5);
        miCuadrado.establecerLado(5.0);
        miRectangulo.establecerAncho(4.0);
        miRectangulo.establecerLargo(8.0);

        System.out.println("Después de modificar las propiedades:");
        System.out.println("Círculo modificado: " + miCirculo);
        System.out.println("Cuadrado modificado: " + miCuadrado);
        System.out.println("Rectángulo modificado: " + miRectangulo);
    }
}