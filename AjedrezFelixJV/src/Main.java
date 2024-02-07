import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Juego juego=new Juego();

        tablero.pintarTablero();

        System.out.print("movimiento nuevo: ");
       String movimiento = lectura.next();
       Movimiento mov = juego.jugada(movimiento,tablero);
        System.out.println(mov);
        tablero.moverPieza(mov);
        tablero.pintarTablero();

    }


}