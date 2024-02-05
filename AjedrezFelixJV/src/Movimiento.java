public class Movimiento {
    private Posicion posFinal;
    private Posicion posInicial;

    public Movimiento(){
    }

    /**
     * Constructor que determina la siguiente posicion.
     * @param posFinal Determina los dos valores de la posicion Final
     * @param posInicial Determina los dos valores de la posicion Inicial
     */
    public Movimiento(Posicion posFinal, Posicion posInicial){
        this.posFinal= posFinal;
        this.posInicial = posInicial;
    }

    /**
     * Metodo que determina si el movimiento es horizontal
     * @return Te devuelve un true si la fila de la posición final es igual a la de la inicial
     */
    public boolean esHorizontal(){
        boolean respuesta = false;
        if(posInicial.getFila()== posFinal.getFila()){
            respuesta = true;
        }
        return respuesta;
    }

    /**
     * Metodo que determina si el movimiento es vertical
     * @return Te devuelve un true si la columna de la posición final es igual a la de la inicial
     */
    public boolean esVertical(){
        boolean respuesta = false;
        if(posInicial.getColumna()== posFinal.getColumna()){
            respuesta = true;
        }
        return respuesta;
    }

    /**
     * Metodo que comprueba y devuelve el numero de saltos que da una pieza en un movimiento horizontal
     * @return Devolverá un int de la cifra de saltos
     */
    public int saltoHorizontal(){
        return posFinal.getColumna()- posInicial.getColumna();
    }

    /**
     * Metodo que comprueba y devuelve el número de saltos que da una pieza en un movimiento horizontal
     * @return Devolverá un int de la cifra de saltos
     */
    public int saltoVertical(){
        return posFinal.getFila()- posInicial.getFila();
    }
}
