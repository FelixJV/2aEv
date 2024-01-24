public class CentroSalud {
    private int id;
    private String nombre;
    private String domicilio;
    private String postcode;

    public CentroSalud(int ident, String nombre, String domicilio, String codigopostal){
        id = ident;
        this.nombre = nombre;
        this.domicilio = domicilio;
        postcode = codigopostal;
    }
}
