package PaqueteCirculo;

public class DemostraciónCirculoyCilindro {
	public static void main(String[] args) {
		
		Circulo circulo1 = new Circulo();
		Circulo circulo2 = new Circulo(2.5);
		Circulo circulo3 = new Circulo(3.0, "azul");
		
		System.out.println("Circulo 1: " +circulo1);
		System.out.println("Area del Círculo 1: "+circulo1.getArea());
		
		System.out.println("Circulo 2: " +circulo2);
		System.out.println("Area del Círculo 2: "+circulo2.getArea());
		
		System.out.println("Circulo 3: " +circulo3);
		System.out.println("Area del Círculo 3: "+circulo3.getArea());
		
		Cilindro cilindro1 = new Cilindro();
		Cilindro cilindro2 = new Cilindro();
		Cilindro cilindro3 = new Cilindro();
		
		System.out.println("\nCilindro 1: " +cilindro1);
		System.out.println("Area del Cilindro 1: "+cilindro1.getArea());
		
		System.out.println("Cilindro 2: " +cilindro2);
		System.out.println("Area del Cilindro 2: "+cilindro2.getArea());
		
		System.out.println("Cilindro 3: " +cilindro3);
		System.out.println("Area del Cilindro 3: "+cilindro3.getArea());
		
		System.out.println("\nHerencia: " +cilindro1);
		System.out.println("Radio del cilindro 3: "+cilindro3.getRadio());
		System.out.println("Color del cilindro 3: " +cilindro3.getColor());
		System.out.println("Area del Cilindro 1: "+cilindro3.getArea());
		
	}
}
