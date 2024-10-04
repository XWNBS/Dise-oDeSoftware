package PaqueteAnimal;

public class DemoAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal Genérico");
        gato gato = new gato("Mishi");
        perro perro = new perro("Firulais");

        System.out.println(animal);
        System.out.println(gato);
        System.out.println(perro);

        gato.saluda();
        perro.saluda();
        perro.saluda(new perro("Rex"));
    }
}