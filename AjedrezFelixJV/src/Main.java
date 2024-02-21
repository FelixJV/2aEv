import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Juego juego = new Juego();

        tablero.pintarTablero();
        Movimiento mov = null;
        boolean fin = false;
        do {
            do {
                System.out.print("Turno de " +  (juego.getTurno()?"negras":"blancas") + ", movimiento nuevo: ");
                String movimiento = lectura.nextLine();
                mov = juego.jugada(movimiento, tablero);
            } while (mov == null);
            if (tablero.devolverPieza(mov.getPosInicial()).validoMovimiento(mov,tablero)) {
                if(tablero.devolverPieza(mov.getPosFinal())!=null){
                    if(tablero.devolverPieza(mov.getPosFinal()).getClass().getSimpleName().equals("Rey")){
                        System.out.println("Nice Kill, GG");
                        fin = true;
                    }
                }

                tablero.moverPieza(mov);
                juego.setTurno(!juego.getTurno());
            }else
                System.out.println(tablero.devolverPieza(mov.getPosInicial()).mensajePersonalizado());

            tablero.pintarTablero();
        } while (fin == false);
    }

}