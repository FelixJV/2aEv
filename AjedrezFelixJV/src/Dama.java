public class Dama extends Pieza{
    public Dama(boolean color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        return mov.esDiagonal()|| mov.esVertical() || mov.esHorizontal();
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
        return "";
    }
}
