package com.alura.libreriaweb.datos;

public enum Generos {
    ACCION ("Action"),
    ROMANCE ("Romance"),
    CRIMEN ("Crime"),
    COMEDIA ("Comedy"),
    DRAMA ("Drama"),
    AVENTURA ("Adventure"),
    FICCION ("Fiction"),
    DESCONOCIDO("Desconocido");

    private String genero;

    Generos(String generoGutendex) {
        this.genero = generoGutendex;
    }

    public static Generos fromString(String text){
        for (Generos generoEnum: Generos.values()){
            if (generoEnum.genero.equals(text)){
                return generoEnum;
            }
        }
        return Generos.DESCONOCIDO;
    }
}
