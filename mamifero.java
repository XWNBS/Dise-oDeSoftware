package PaqueteAnimal;

public class mamifero extends Animal {
    public mamifero(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString() {
        return "Mamifero[" + super.toString() + "]";
    }
}