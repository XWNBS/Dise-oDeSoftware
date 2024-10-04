package PaquetePersona;

public class Personal extends Persona {
	private String escuela;
	private double salario;
	
	public Personal(String nombre, String direccion, String escuela, double salario) {
		super(nombre, direccion);
		this.escuela = escuela;
		this.salario = salario;
	}

	public String getEscuela() {
		return escuela;
	}
	
	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override 
	public String toString() {
		return "Personal[" + super.toString() + ",escuela=" + escuela + ",salario=" + salario + "]"; 
	} 
}
