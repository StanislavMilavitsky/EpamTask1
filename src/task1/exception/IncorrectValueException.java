package by.milavitsky.homework.task1.exception;

public class IncorrectValueException extends Exception {

    public IncorrectValueException(){}

    public IncorrectValueException(String message) {
        super(message);//??
    }

    public IncorrectValueException(String message, Throwable cause){

    }

    public IncorrectValueException(Throwable cause){}
}

