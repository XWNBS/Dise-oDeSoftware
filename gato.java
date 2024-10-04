package PaqueteAnimal;

public class gato extends mamifero {
    public gato(String nombre) {
        super(nombre);
    }
    
    public void saluda() {
        System.out.println("Miau");
    }
    
    @Override
    public String toString() {
        return "Gato[" + super.toString() + "]";
    }
}