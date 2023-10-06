package Lecture8;

public class WrongLoginException extends Exception{
    WrongLoginException(String description){
        super(description);
    }
    WrongLoginException(){

    }
}
