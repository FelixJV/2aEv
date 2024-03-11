package org.example;

import net.datafaker.Faker;

public class Jugador {
    private String nombre;
    private boolean bici;

    Faker faker = new Faker();
    public Jugador(String nombre){
        this.nombre = nombre;
        bici = false;
    }

    public Jugador(){
        nombre = faker.funnyName().name();
        bici=false;
    }
}
