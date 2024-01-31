public class Movimiento {
    private Posicion posFinal;
    private Posicion posInicial;

    public Movimiento(){

    }

    public Movimiento(Posicion posFinal, Posicion posInicial){
        this.posFinal= posFinal;
        this.posInicial = posInicial;
    }

    public boolean esHorizontal(){
        boolean respuesta = false;
        if(posInicial.getFila()== posFinal.getFila()){
            respuesta = true;
        }
        return respuesta;
    }
    public boolean esVertical(){
        boolean respuesta = false;
        if(posInicial.getColumna()== posFinal.getColumna()){
            respuesta = true;
        }
        return respuesta;
    }
    public int saltoHorizontal(){
        return posFinal.getColumna()- posInicial.getColumna();
    }
    public int saltoVertical(){
        return posFinal.getFila()- posInicial.getFila();
    }
}
