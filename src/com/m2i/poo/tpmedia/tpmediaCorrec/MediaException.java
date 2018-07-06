package com.m2i.poo.tpmedia.tpmediaCorrec;

public class MediaException extends Exception {
    public MediaException(String message) {
        super(message);

    }
}

//1 Créer MediaException -> Exception
//2 Lever l'exception dans Cart.remove
//3 Cart.validate() throw une exception si totalNetPrice <= 0
//4 MediaRow.decrement --> impossible d'avoir une quantité < 1