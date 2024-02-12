public class Alfil extends Pieza{
    public Alfil(boolean color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {

        return mov.esDiagonal();
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
