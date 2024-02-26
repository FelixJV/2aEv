public class Caballo extends Pieza{
    public Caballo(boolean color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        return Math.abs(mov.saltoHorizontal())==2&&Math.abs(mov.saltoVertical())==1||Math.abs(mov.saltoVertical())==2&&Math.abs(mov.saltoHorizontal())==1;
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
        return " Ese movimiento es adecuado para un caballo";
    }
}