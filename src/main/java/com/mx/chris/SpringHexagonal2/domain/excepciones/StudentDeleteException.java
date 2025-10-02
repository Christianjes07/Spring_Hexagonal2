package com.mx.chris.SpringHexagonal2.domain.excepciones;

public class StudentDeleteException extends RuntimeException {

    public StudentDeleteException(String message) {
        super(message);

    }

    public StudentDeleteException(String message, Throwable cause) {
        super(message, cause);

    }

}
