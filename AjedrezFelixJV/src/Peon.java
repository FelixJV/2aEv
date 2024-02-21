public class Peon extends Pieza {
    public Peon(boolean color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean valido = false;
        if (isColor()) {//blanco
            if (mov.getPosInicial().getFila() == 6) {
                if (mov.esVertical() && (mov.saltoVertical() == -1 || mov.saltoVertical() == -2) && !tablero.hayPieza(mov.getPosFinal())
                        || (mov.esDiagonal() && mov.saltoVertical() == -1 && tablero.hayPieza(mov.getPosFinal()))) {
                    valido = true;
                }
            } else {//fila distinta de la inicial
                if (mov.esVertical() && mov.saltoVertical() == -1 && !tablero.hayPieza(mov.getPosFinal())
                        || (mov.esDiagonal() && mov.saltoVertical() == -1 && tablero.hayPieza(mov.getPosFinal()))) {
                    valido = true;
                }
            }
    }else

    {//negro
        if (mov.getPosInicial().getFila() == 1) {
            if (mov.esVertical()&&mov.saltoVertical() == 1 || mov.saltoVertical() ==2 && !tablero.hayPieza(mov.getPosFinal())
                    || (mov.esDiagonal() && mov.saltoVertical() == 1 && tablero.hayPieza(mov.getPosFinal()))) {
                valido = true;}

        } else {
            if (mov.esVertical() && mov.saltoVertical() == 1 && !tablero.hayPieza(mov.getPosFinal())
                    || (mov.esDiagonal() && mov.saltoVertical() == 1 && tablero.hayPieza(mov.getPosFinal()))) {
                    valido = true;

            }
        }
    }
        return valido;
}

    public String pintarPieza() {
        if (super.isColor() == false) {
            return this.getClass().getSimpleName().charAt(0) + "N";
        } else {
            return this.getClass().getSimpleName().charAt(0) + "B";
        }
    }

    public String getMensajePersonalizado() {
        return "Sólo en horizontal y vertical";
    }
}
