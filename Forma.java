package PaqueteShape;

public abstract class Forma {
    private String color;
    private boolean relleno;

    public Forma(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public String obtenerColor() {
        return color;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public boolean estaRelleno() {
        return relleno;
    }

    public void establecerRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    @Override 
    public String toString() {
        return "Forma[color='" + color + "', relleno=" + relleno + "]";
    }
}

