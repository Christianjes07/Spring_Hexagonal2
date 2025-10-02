package com.mx.chris.SpringHexagonal2.domain.excepciones;

public class StudentFindException extends RuntimeException {

    public StudentFindException (String message){

    }


    public StudentFindException(String message, Throwable cause){
        super(message, cause);
    }
}
