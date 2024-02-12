public class Peon extends Pieza {
    public Peon(boolean color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean valido = false;
        if (!isColor()){
           if (mov.getPosInicial().getFila()==6){
               if(mov.saltoVertical()==-1||mov.saltoVertical()==-2){
                   valido=true;
               }
           }else{
               if(mov.getPosFinal()==null){
                   if
               }

           }
        }else{
            if(mov.getPosInicial().getFila()==1){
                if(mov.saltoVertical()==1||mov.saltoVertical()==2){
                    valido=true;
                }

            }else{

            }
    }
        return valido;
    }

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
