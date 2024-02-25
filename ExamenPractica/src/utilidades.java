public class utilidades {
    public static final String [] tipos = {"Piedra", "Papel", "Tijera"};



    public static String dameTipo(){
        return utilidades.tipos[(int) (Math.random()* tipos.length)];
    }
}
