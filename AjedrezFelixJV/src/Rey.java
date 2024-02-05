public class Rey extends Pieza{
    public Rey(boolean color) {
    }


    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }

    @Override
    public String pintarPieza() {
        if (super.isColor()==false) {
            return this.getClass().getSimpleName().charAt(0) + "N";
        }else{
            return this.getClass().getSimpleName().charAt(0) + "B";
        }
    }
}
