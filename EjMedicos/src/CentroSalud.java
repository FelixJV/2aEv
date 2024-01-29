public class CentroSalud {
    private int id;
    private String nombre;
    private String domicilio;
    private int postcode;

    public CentroSalud(int ident, String nombre, String domicilio, int codigopostal){
        id = ident;
        this.nombre = nombre;
        this.domicilio = domicilio;
        postcode = codigopostal;
    }
    public CentroSalud(){
        id = (int) (Math.random()*5);
        nombre = Utilidades.dameNombre();
        domicilio = Utilidades.dameDomi();
        postcode = (int) (Math.random()*3000+2000);
    }

    @Override
    public String toString() {
        return "CentroSalud{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", postcode=" + postcode +
                '}';
    }
}
