import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Juego juego = new Juego();

        tablero.pintarTablero();
        Movimiento mov = null;
        boolean fin;
        do {
            do {
                System.out.print("movimiento nuevo: ");
                String movimiento = lectura.next();
                mov = juego.jugada(movimiento, tablero);
                System.out.println(mov);
            } while (mov == null);
            if (tablero.devolverPieza(mov.getPosInicial()).validoMovimiento(mov)) {
                tablero.moverPieza(mov);
                juego.setTurno(!juego.getTurno());
            }else
                System.out.println(tablero.devolverPieza(mov.getPosInicial()).mensajePersonalizado());

            tablero.pintarTablero();
        } while (true);
    }

}