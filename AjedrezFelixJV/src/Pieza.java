public abstract class Pieza {
    private boolean color;
    private String nombre;

    public Pieza(){}

    public Pieza(boolean color) {
        this.color = color;
    }

    public abstract boolean validoMovimiento(Movimiento mov);

     public abstract String pintarPieza();

    @Override
    public String toString() {
        return "Pieza{" +
                "color=" + color +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
