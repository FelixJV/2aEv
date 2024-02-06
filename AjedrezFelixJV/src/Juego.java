public class Juego {
    private int turno;


    public Juego() {
        this.turno = 0;
    }

    public Movimiento jugada(String movimiento, Tablero tablero){

        movimiento = movimiento.toUpperCase();

        int colinicial = movimiento.charAt(0) - 65;
        int filinicial = movimiento.charAt(1) - 49;
        int colfinal = movimiento.charAt(2) -65;
        int filfinal = movimiento.charAt(3) - 49;


        return new Movimiento(new Posicion(colinicial,filinicial),new Posicion(colfinal,filfinal));
    }


    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
