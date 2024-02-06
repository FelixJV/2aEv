public class Torre extends Pieza {
    public Torre(boolean color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esHorizontal() || mov.esVertical();
    }

    @Override
    public String pintarPieza() {
        if (!super.isColor()) {
            return this.getClass().getSimpleName().charAt(0) + "N";
        } else {
            return this.getClass().getSimpleName().charAt(0) + "B";
        }
    }
}
