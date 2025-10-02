package com.mx.chris.SpringHexagonal2.domain.excepciones;

public class StudentRegistrationException extends RuntimeException {


    public StudentRegistrationException(String message){
        super(message);

    }


    public StudentRegistrationException(String message, Throwable cause){
        super(message, cause);


    }

}
