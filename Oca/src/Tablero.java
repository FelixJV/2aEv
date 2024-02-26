import java.util.Arrays;

public class Tablero {
    private Jugador[] tablero = new Jugador[16];

    public Tablero() {
        tablero[0] = new Jugador("F");
    }


    public void Mostrar(Jugador jugador) {

        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] == null) {
                System.out.print(" [] ");
            } else {
                System.out.print(jugador.getNombre());
            }

        }


    }
    public void Avance(){
        for (int i = 0; i < tablero.length; i++) {
            if(tablero[i]!=null){
                tablero[i] + Dado.tirada();
            }
        }
    }
}
