package PaqueteAnimal;

public class perro extends mamifero {
    public perro(String nombre) {
        super(nombre);
    }
    
    public void saluda() {
        System.out.println("Guau");
    }
    
    public void saluda(perro otro) {
        System.out.println("Guauuu");
    }
    
    @Override
    public String toString() {
        return "Perro[" + super.toString() + "]";
    }
}