package com.mibarrio.api.exceptions;

public class ModeloNotFoundExeption extends RuntimeException{

    public ModeloNotFoundExeption(String mensaje){
        super(mensaje);
    }
}
