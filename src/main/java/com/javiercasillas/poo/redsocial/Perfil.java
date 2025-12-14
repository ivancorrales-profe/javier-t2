package com.javiercasillas.poo.redsocial;

public class Perfil {

    //Atributos

    private String nombreusuario;
    private String nombrevisible;
    private String biografia;
    private String paisociudad;
    private int numeroseguidores;
    private int numeropublicaciones;
    private Estado estadodelperfil;
    private boolean cuentaverificada;


    //Meotodos
    public void mostrarInformacion() {
        System.out.println("nombre de usuario:" + nombreusuario);
        System.out.println("nombre visible: " + nombrevisible);
        System.out.println("biografia; " + biografia);
        System.out.println("pais o ciudad" + paisociudad);
        System.out.println("numero de seguidores: " + numeroseguidores);
        System.out.println("numero de publicaciones" + numeropublicaciones);
        System.out.println("Estado" + estadodelperfil);
        System.out.println("Cuenta verificada" + cuentaverificada);
    }

    public void añadirseguidores(int seguidores) {
        numeroseguidores += seguidores;
    }

    public void cambiarestado(Estado estado) {
        estadodelperfil = estado;
    }

    public boolean estadoActivo() {
        return estadodelperfil == Estado.COMPLETADO;

    }
}
