public class Utilidades {
    public static final String [] nombres = {"Manu" , "Rodri", "Marta"};
     public static final String [] domicilio = {"Paris", "Madrid", "Roma"};

    public static String dameNombre(){
        return Utilidades.nombres[(int) (Math.random()*Utilidades.nombres.length)];
    }
    public static String dameDomi(){
        return Utilidades.domicilio[(int) (Math.random()*Utilidades.domicilio.length)];
    }
}
