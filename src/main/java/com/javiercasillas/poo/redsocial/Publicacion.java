package com.javiercasillas.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {
    //Atributos

    LocalTime hora;
    private String texocontenido;
    private int numerodelikes;

    //Contructor
    public Publicacion(String contenido) {
        this.hora = LocalTime.now();
        this.texocontenido = contenido;
        this.numerodelikes = 0;

    }
}

