public class Tablero {
    private Pieza[][] tablero = new Pieza[8][8];

    public Tablero() {
        tablero[0][0] = new Torre(false);
    }
    public void pintarTablero(){
    }
    public boolean hayPieza(int fila, int columna){
        boolean hay = false;
        return hay;
    }
    public boolean hayPieza(Posicion pos){
        boolean hay = false;
        return hay;
    }
    public boolean hayPiezaEntre(Movimiento mov){
        boolean hay = false;
        return hay;
    }
    public void ponPieza(Pieza pieza, int fila, int columna){}

    public void ponPieza(Pieza pieza, Movimiento mov){}

    public void quitaPieza(int fila, int columna){}

    public void quitaPieza(Posicion pos){}

    public Pieza devuelvePieza(int fila, int columna){
        Pieza nPieza = new Pieza();
        return nPieza;
    }
    public Pieza devuelvePieza(Posicion pos){
        Pieza nPieza = new Pieza();
        return nPieza;
    }

}
