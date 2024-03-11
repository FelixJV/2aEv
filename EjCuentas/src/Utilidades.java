import java.util.Random;

public class Utilidades {
    public static final String[] nombres ={"Milo", "Kaydy", "David"};
    public static final String[] apellidos ={"J", "Kain", "Guetta"};

    public static String dameNombre(){
        Random random = new Random();
        return Utilidades.nombres[random.nextInt(0,2)];
    }
    public static String dameApellidos(){
        return Utilidades.apellidos[(int)(Math.random()* apellidos.length)];
    }
}
