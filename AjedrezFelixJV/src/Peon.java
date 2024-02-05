public class Peon extends Pieza {
    public Peon(boolean color) {
    }


    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }

    public String pintarPieza() {
        if (super.isColor()==false) {
            return this.getClass().getSimpleName().charAt(0) + "N";
        }else{
            return this.getClass().getSimpleName().charAt(0) + "B";
        }
    }
}
