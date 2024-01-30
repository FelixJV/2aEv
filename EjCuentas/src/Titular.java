public class Titular {
    private String Nombre;
    private String Apellidos;
    private int Edad;

    public Titular(String nombre, String apellido, int edad){
        this.Nombre=nombre;
        this.Apellidos=apellido;
        this.Edad=edad;
    }
    public Titular(){

        Nombre = Utilidades.dameNombre();
        Apellidos = Utilidades.dameApellidos();
        Edad = (int) (Math.random()*80+18);
    }

    @Override
    public String toString() {
        return "Titular{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Edad=" + Edad +
                '}';
    }
}
