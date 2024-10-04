package PaquetePersona;

public class Estudiante extends Persona {
	private String programa;
	private int año;
	private double cuota;
	
	public Estudiante(String nombre, String direccion, String programa, int año, double cuota) {
		super(nombre, direccion);
		this.programa = programa;
		this.año = año;
		this.cuota = cuota;
	}
	
	public String getPrograma() {
		return programa;
	}
	
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	
	public int getAño() {
		return año;
	}
	
	public void setAño(int año) {
		this.año = año;
	}
	
	public double getCuota() {
		return cuota;
	}
	
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	
	@Override 
	public String toString() {
		return "Estudiante[" + super.toString() + ",programa=" + programa + ",año=" + año + ",cuota=" + cuota + "]"; 
	} 
}
