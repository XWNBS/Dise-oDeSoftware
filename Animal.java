package PaqueteAnimal;

public class Animal {
	private String nombre;
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "Animal[nombre=\"" + nombre + "\"]";
	}
}
