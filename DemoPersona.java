package PaquetePersona;

public class DemoPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan Pérez", "Calle Principal 123");
        System.out.println("Persona:");
        System.out.println(persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Dirección: " + persona.getDireccion());

        System.out.println("\n------------------------\n");

        Estudiante estudiante = new Estudiante("Ana García", "Avenida Roble 456", "Informática", 2, 5000.0);
        System.out.println("Estudiante:");
        System.out.println(estudiante);
        System.out.println("Programa: " + estudiante.getPrograma());
        System.out.println("Año: " + estudiante.getAño());
        System.out.println("Cuota: " + estudiante.getCuota());

        System.out.println("\n------------------------\n");

        Personal personal = new Personal("Roberto Rodríguez", "Calle Pino 789", "Escuela de Ingeniería", 30000.0);
        System.out.println("Personal:");
        System.out.println(personal);
        System.out.println("Escuela: " + personal.getEscuela());
        System.out.println("Salario: " + personal.getSalario());

        System.out.println("\n------------------------\n");

        System.out.println("Demostración de herencia:");
        System.out.println("Nombre del estudiante (heredado de Persona): " + estudiante.getNombre());
        System.out.println("Dirección del personal (heredado de Persona): " + personal.getDireccion());

        estudiante.setPrograma("Matemáticas");
        personal.setSalario(35000.0);
        System.out.println("\nDespués de las modificaciones:");
        System.out.println("Nuevo programa del estudiante: " + estudiante.getPrograma());
        System.out.println("Nuevo salario del personal: " + personal.getSalario());
    }
}