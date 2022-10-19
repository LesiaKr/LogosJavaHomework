package core.nine_exception.TaskThree;

public class MyException extends Exception{
    @Override
    public String getMessage() {
        return "This is just a non-working calculator!";
    }
}
