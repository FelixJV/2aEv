package org.example;

public class Tablero {

    private Casilla [] tablero;
    public Tablero(){
      Casilla  []tablero = new Casilla[95];
        for (int i = 0; i < 96; i++) {
            if(i==0){
                tablero[i]=new Salida();
            }else if(i==40||i==10||i==60||i==66){
                tablero[i] = new Bici();
            }else if(i==14||i==30||i==46||i==62||i==78){
                tablero[i]=new Mercadillo();
            }else if(i==94){
                tablero[i]=new DrogasNo();
            }else if(i==95){
                tablero[i]=new Fin();
            }else{
                tablero[i]= new Neutra();
            }
        }
    }
}
