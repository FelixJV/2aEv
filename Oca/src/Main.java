
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Jugador jugador = new Jugador("F");
        tablero.Mostrar(jugador);
        Dado.tirada();
    }
}