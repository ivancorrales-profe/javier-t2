package com.javiercasillas.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {
 //Atributos
	
	private String texocontenido;
	private int numerodelikes;
	LocalTime hora;

//Contructor
	public Publicacion (String contenido) {
	this.hora = LocalTime.now();
	this.texocontenido = texocontenido;
	this.numerodelikes = 0;
	
}
}

