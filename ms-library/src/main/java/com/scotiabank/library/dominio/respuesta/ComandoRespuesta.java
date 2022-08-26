package com.scotiabank.library.dominio.respuesta;

public class ComandoRespuesta<T> {

    private T valor;

    public ComandoRespuesta(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }
}
