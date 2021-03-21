package HW2.Exceptions;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j) {
        super("В ячейке массива с индексом " + i + ":" + j + " не корректное значение!");
    }
}
