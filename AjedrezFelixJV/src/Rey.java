public class Rey extends Pieza{
    public Rey(boolean color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        return mov.esHorizontal()&&Math.abs(mov.saltoHorizontal())==1||mov.esVertical()&&Math.abs(mov.saltoVertical())==1||mov.esDiagonal()&&Math.abs(mov.saltoHorizontal())==1;
    }

    @Override
    public String pintarPieza() {
        if (super.isColor()==false) {
            return this.getClass().getSimpleName().charAt(0) + "N";
        }else{
            return this.getClass().getSimpleName().charAt(0) + "B";
        }
    }
    public String getMensajePersonalizado() {
        return "Sólo en horizontal y vertical";
    }
}
