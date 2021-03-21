package HW2.Exceptions;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Не корректный размер масива!");
    }
}
