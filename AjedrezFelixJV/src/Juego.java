public class Juego {
    private boolean turno;

    /**
     * Constructor de juego que inicializa el color del turno
     */
    public Juego() {
        this.turno = false;
    }

    /**
     * Metodo que traduce y comprueba que el movimiento a realizar es correcto.
     * @param movimiento
     * @param tablero
     * @return
     */
    public Movimiento jugada(String movimiento, Tablero tablero){
        Movimiento mov = null;
        movimiento = movimiento.toUpperCase();

        int colinicial = movimiento.charAt(0) - 65;
        int filinicial = movimiento.charAt(1) - 49;
        int colfinal = movimiento.charAt(2) -65;
        int filfinal = movimiento.charAt(3) - 49;
        if(movimiento.length()!=4)
            System.out.println("La jugada tiene que ser del tipo A2A3");
        else if(noEnRango(filinicial) || noEnRango(colinicial) || noEnRango(filfinal) || noEnRango(colfinal)) { //0..7 los 4 números, dos filas y dos columnas ******
            System.out.println("La fila va de 1 a 8, y la columna de A a H");
        }
        else if (tablero.hayPieza(filinicial,colinicial)==false){
            System.out.println("En esa posicion inicial no hay ninguna pieza");
        }
        else if (tablero.devolverPieza(filinicial,colinicial).isColor() != turno){
            System.out.println("No es el turno de las piezas " + tablero.devolverPieza(filinicial,colinicial).isColor());
        }
        else if (tablero.devolverPieza(filfinal, colfinal) != null){
           if (tablero.devolverPieza(filfinal,colfinal).isColor() == tablero.devolverPieza(filinicial,colinicial).isColor()){
                System.out.println("No te puedes comer una pieza de tu mismo color, amigo.");
            }
        }
        else{//ole ole ya tengo movimiento
            mov = new Movimiento(new Posicion(filinicial,colinicial),new Posicion(filfinal,colfinal));
            turno = !turno;
        }
        return mov;
    }

    /**
     * metodo que nos ayudará en el metodo de comprobar jugada para ver si los valores de las posiciones están dentro de los rangos establecidos
     * @param valor
     * @return
     */
    private boolean noEnRango(int valor) {
        return !(valor>=0&&valor<=7);
    }


    public boolean getTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
}
