public class Posicion {
    private int fila;
    private int columna;

    public Posicion(){
        fila = 0;
        columna = 0;
    }

    /**
     * Contructor de una posicion con un número de fila y otro de columna
     * @param fila un numero traducido del movimiento escrito por el jugador
     * @param columna un numero traducido del movimiento escrito por el jugador
     */
    public Posicion(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Posicion {" + "fila=" + fila + ", columna=" + columna + '}';
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
}
