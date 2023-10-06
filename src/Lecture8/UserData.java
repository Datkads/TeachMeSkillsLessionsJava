package Lecture8;

public class UserData {

    public static boolean singInData(String login, String password, String passwordConfirmation){
        boolean loginIsCorrect = false;
        boolean passwordIsCorrect = false;
        boolean passwordConfirmationIsCorrect = false;
        if (login.contains(" ") || login.length() > 20){
            try {
                throw new WrongLoginException("User entered invalid login that has spaces or extends 20 symbols.");
            }
            catch (WrongLoginException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            System.out.println("Your login is accepted.");
            loginIsCorrect = true;
        }
        if (password.contains(" ") || password.length() > 20){
            try{
                throw new WrongPasswordException("User entered invalid password that has spaces or extends 20 symbols.");
            }
            catch (WrongPasswordException e) {
                throw new RuntimeException(e);
            }
        } else {
            // Честно говоря не понимаю каким образом дописать сюда обязательство вписать другие цифры, таким образом вышло только указать одну.
            if (password.contains("1")) {
                System.out.println("Your password is accepted.");
                passwordIsCorrect = true;
            } else {
                System.out.println("Invalid data used for password. At least one digit expected");
            }
        }
        if (!passwordConfirmation.equals(password)){
            System.out.println("Your password confirmation doesn't match your password.");
        }
        else {
            System.out.println("Your password confirmation is accepted.");
            passwordConfirmationIsCorrect = true;
        }

        System.out.println();
        // Так же не совсем понимаю каким образом реализовать возвращение false-true и зачем они тут вообще.
        if (passwordIsCorrect && passwordConfirmationIsCorrect){
            System.out.println("User is successfully registered.");
            return true;
        }
        else {
            System.out.println("Registration is not successful.");
            return false;
        }
    }
}
