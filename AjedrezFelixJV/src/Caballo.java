public class Caballo extends Pieza{
    public Caballo(boolean color) {
        super(color);
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