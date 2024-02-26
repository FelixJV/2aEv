import java.util.Scanner;

public class Tablero {
    private Pieza[][] tablero = new Pieza[8][8];

    /**
     * El constructor tablero sirve para dar valores a nuestro array tablero y lo llena de piezas.
     */
    public Tablero() {

        tablero[0][0] = new Torre(false);
        tablero[0][1] = new Caballo(false);
        tablero[0][2] = new Alfil(false);
        tablero[0][3] = new Dama(false);
        tablero[0][4] = new Rey(false);
        tablero[0][5] = new Alfil(false);
        tablero[0][6] = new Caballo(false);
        tablero[0][7] = new Torre(false);
        boolean exit = false;

        for (int j = 0; j < 8; j++) {
            tablero[1][j] = new Peon(false);
        }




        tablero[7][0] = new Torre(true);
        tablero[7][1] = new Caballo(true);
        tablero[7][2] = new Alfil(true);
        tablero[7][3] = new Dama(true);
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
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] != null) {
                    System.out.print("[ " + tablero[i][j].pintarPieza() + " ]");
                } else {
                    System.out.print("[    ]");
                }
            }
            System.out.println("\n");
        }
    }

    /**
     * metodo que sustituirá la posición de una pieza a una nueva proporcionada por el usuario.
     *
     * @param mov dato proporcionado por el usuario con posicion inicial, final y columna inicial y final.
     */
    public void moverPieza(Movimiento mov) {
        //int filaInicial = mov.getPosInicial().getFila();
        //int columnaInicial = mov.getPosInicial().getColumna();
        /*tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = tablero[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()];
        tablero[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()] = null;*/

        /*ponPieza(devolverPieza(mov.getPosInicial()), mov.getPosFinal().getFila(), mov.getPosFinal().getColumna());
        quitaPieza(mov.getPosInicial());*/

        ponPieza(devolverPieza(mov.getPosInicial()), mov.getPosFinal());
        //ponPieza(tablero[filaInicial][columnaInicial],mov.getPosFinal());
        quitaPieza(mov.getPosInicial());
    }

    public boolean hayPiezasEntre(Movimiento mov) {
        //return tablero[mov.getPosInicial().getFila()+1][mov.getPosInicial().getColumna()+1]!=null;
        boolean respuesta = false;
        if (mov.esVertical()) {
            if (mov.getPosInicial().getFila() < mov.getPosFinal().getFila())
                for (int fila = mov.getPosInicial().getFila() + 1; fila < mov.getPosFinal().getFila(); fila++) {
                    //if(tablero[fila][mov.getPosInicial().getColumna()]!=null){
                    if (hayPieza(fila, mov.getPosFinal().getColumna()))
                        respuesta = true;
                }

            else
                for (int i = mov.getPosInicial().getFila()-1; i >mov.getPosFinal().getFila(); i--) {
                    if(hayPieza(i, mov.getPosFinal().getColumna()))
                        respuesta = true;
                }

        }
        else if (mov.esHorizontal()) {
                if(mov.getPosInicial().getColumna()<mov.getPosFinal().getColumna()){
                    for (int columna = mov.getPosInicial().getColumna()+1; columna < mov.getPosFinal().getColumna(); columna++) {
                        if (hayPieza(mov.getPosInicial().getFila(),columna)){
                            respuesta = true;
                        }
                    }
                }else{
                    for (int columna = mov.getPosInicial().getColumna()-1; columna > mov.getPosFinal().getColumna(); columna--) {
                        if(hayPieza(mov.getPosInicial().getFila(), columna)){
                            respuesta = true;
                        }
                    }
                }

        } else if (mov.esDiagonal()) {
                if(mov.getPosInicial().getFila()<mov.getPosFinal().getFila()&&mov.getPosInicial().getColumna()<mov.getPosFinal().getColumna()){//
                    for (int i = mov.getPosInicial().getFila()+1, j = mov.getPosInicial().getColumna()+1; i < mov.getPosFinal().getColumna(); i++,j++) {
                        if(hayPieza(i,j)){
                            respuesta = true;
                        }
                    }
                }else if(mov.getPosInicial().getFila()>mov.getPosFinal().getFila()&&mov.getPosInicial().getColumna()>mov.getPosFinal().getColumna()){
                    for (int i = mov.getPosInicial().getFila()-1, j = mov.getPosInicial().getColumna()-1; i < mov.getPosFinal().getColumna(); i--,j--){
                        if(hayPieza(i,j)){
                            respuesta = true;
                        }
                    }
                }else if(mov.getPosInicial().getFila()>mov.getPosFinal().getFila()&&mov.getPosInicial().getColumna()<mov.getPosFinal().getColumna()){
                    for (int i = mov.getPosInicial().getFila()-1, j = mov.getPosInicial().getColumna()+1; i < mov.getPosFinal().getColumna(); i--,j++){
                        if(hayPieza(i,j)){
                            respuesta = true;
                        }
                    }
                }else if(mov.getPosInicial().getFila()<mov.getPosFinal().getFila()&&mov.getPosInicial().getColumna()>mov.getPosFinal().getColumna()){
                    for (int i = mov.getPosInicial().getFila()+1, j = mov.getPosInicial().getColumna()-1; i < mov.getPosFinal().getColumna(); i++,j--){
                        if(hayPieza(i,j)){
                            respuesta = true;
                        }
                    }
                }
            }
            return respuesta;
        }
        public boolean compProm(Movimiento mov){
            return mov.getPosInicial().getClass().getSimpleName().equals("Peon") && mov.getPosFinal()==null && (mov.getPosFinal().getFila()==0||mov.getPosFinal().getFila()==7);
        }
        public Pieza Promocion(Movimiento mov){
            Scanner lectura = new Scanner(System.in);
            System.out.println("A que pieza te gustaría promocionar el Peón: 1. Reina, 2. Torre, 3. Alfil, 4. Caballo");
            int op = lectura.nextInt();
            switch (op){
                case(1):

                    return tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()]= new Dama(false);
                }


            return tablero[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()]= new Dama(false);
        }

        /**
         * Metodo que nos dejará ver la pieza que hay en determinada posicion del tablero
         *
         * @param fila
         * @param columna
         * @return
         */
        public Pieza devolverPieza ( int fila, int columna){
            return tablero[fila][columna];
        }

        public Pieza devolverPieza (Posicion pos){
            return devolverPieza(pos.getFila(), pos.getColumna());
        }

        /**
         * Metodo booleano que nos devolverá un true en caso de que exista una pieza en la posicion elegida del tablero
         *
         * @param fila
         * @param columna
         * @return
         */
        public boolean hayPieza ( int fila, int columna){
            return tablero[fila][columna] != null;
        }

        public boolean hayPieza (Posicion pos){
            return hayPieza(pos.getFila(), pos.getColumna());
        }


        /**
         * Metodo que a traves de el podemos poner una pieza cualquiera en la posición elegida.
         *
         * @param pieza
         * @param fila
         * @param columna
         */
        public void ponPieza (Pieza pieza,int fila, int columna){
            tablero[fila][columna] = pieza;
        }

        public void ponPieza (Pieza pieza, Posicion pos){
            ponPieza(pieza, pos.getFila(), pos.getColumna());
        }

        /**
         * Método para remplazar una pieza en el tablero por un valor nulo.
         *
         * @param fila
         * @param columna
         */
        public void quitaPieza ( int fila, int columna){
            tablero[fila][columna] = null;
        }

        public void quitaPieza (Posicion pos){
            tablero[pos.getFila()][pos.getColumna()] = null;
        }

        public boolean hayPiezaEntre (Movimiento mov){
            boolean hay = false;
            return hay;
        }

        public Pieza[][] getTablero () {
            return tablero;
        }

}

