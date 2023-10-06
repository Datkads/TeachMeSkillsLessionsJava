package Lecture8;

public class WrongPasswordException extends Exception {
    WrongPasswordException (String description){
        super(description);
    }
    WrongPasswordException(){

    }
}
