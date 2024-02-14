public class Torre extends Pieza {
    /**
     * Contructor de la pieza torre que inicializa su color.
     * @param color
     */
    public Torre(boolean color) {
        super(color);
    }

    /**
     * Metodo para comprobar que el movimiento a realizar se corresponde con las normas de movimiento de la pieza en concreto
     * @param mov
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        return mov.esHorizontal() || mov.esVertical();
    }

    /**
     * Un metodo toString que dependiendo del valor de su color lo imprimira de uno o de otro
     * @return
     */
    @Override
    public String pintarPieza() {
        if (!super.isColor()) {
            return this.getClass().getSimpleName().charAt(0) + "N";
        } else {
            return this.getClass().getSimpleName().charAt(0) + "B";
        }
    }

    @Override
    public String getMensajePersonalizado() {
        return "Sólo en horizontal y vertical";
    }
}
