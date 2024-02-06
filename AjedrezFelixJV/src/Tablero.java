public class Tablero {
    private Pieza[][] tablero = new Pieza[8][8];

    /**
     * El constructor tablero sirve para dar valores a nuestro array tablero y lo llena de piezas.
     */
    public Tablero() {

        tablero[0][0] = new Torre(false);
        tablero[0][1] = new Caballo(false);
        tablero[0][2] = new Alfil(false);
        tablero[0][3] = new Reina(false);
        tablero[0][4] = new Rey(false);
        tablero[0][5] = new Alfil(false);
        tablero[0][6] = new Caballo(false);
        tablero[0][7] = new Torre(false);
        boolean exit = false;
        for (int i = 1; !exit; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = new Peon(false);
                if (j == 7) {
                    exit = true;
                }
            }
        }
        tablero[7][0] = new Torre(true);
        tablero[7][1] = new Caballo(true);
        tablero[7][2] = new Alfil(true);
        tablero[7][3] = new Reina(true);
        tablero[7][4] = new Rey(true);
        tablero[7][5] = new Alfil(true);
        tablero[7][6] = new Caballo(true);
        tablero[7][7] = new Torre(true);


            for (int j = 0; j < 8; j++) {
                tablero[6][j] = new Peon(true);

            }

    }

    /**
     * El metodo pintarTablero sirve para hacer el print de nuestro tablero en consola.
     * Imprimirá la inicial del nombre y el color de la pieza y en el caso de der un espacio null del array imprimirá un espacio en blanco.
     */
    public void pintarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length - 1; j++) {
                if (tablero[i][j] != null) {
                    System.out.print("[ " + tablero[i][j].pintarPieza() + " ]");
                } else {
                    System.out.print("[   ]");
                }
            }
            System.out.println("\n");
        }
    }

 public void moverPieza (Movimiento mov){
        tablero[]
 }

    public boolean hayPieza(int fila, int columna) {
        boolean hay = false;
        return hay;
    }

    public boolean hayPieza(Posicion pos) {
        boolean hay = false;
        return hay;
    }

    public boolean hayPiezaEntre(Movimiento mov) {
        boolean hay = false;
        return hay;
    }

    public void ponPieza(Pieza pieza, int fila, int columna) {
    }

    public void ponPieza(Pieza pieza, Movimiento mov) {
    }

    public void quitaPieza(int fila, int columna) {
    }

    public void quitaPieza(Posicion pos) {
    }


}
