public class Utilidades {
    public static final String[] nombres ={"Milo", "Kaydy", "David"};
    public static final String[] apellidos ={"J", "Kain", "Guetta"};

    public static String dameNombre(){
        return Utilidades.nombres[(int)(Math.random()* nombres.length)];
    }
    public static String dameApellidos(){
        return Utilidades.apellidos[(int)(Math.random()* apellidos.length)];
    }
}
