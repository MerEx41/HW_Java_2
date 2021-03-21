package HW2;

import HW2.Exceptions.MyArrayDataException;
import HW2.Exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][] {{"1","1","1","1"},{"2","2","2","2"},{"3","3","3","3"},{"4","4","4","4"}};

        try {
            System.out.println(arrayMethod(arr));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());

        }

    }

    public static int arrayMethod (String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (!isArrayFourByFour(arr)){
            throw new MyArraySizeException();
        } else {
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        result += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            return result;
        }
    }

    public static boolean isArrayFourByFour (String[][] arr){
        if (arr.length != 4){
            return false;
        } else {
            for (String[] a : arr) {
                if (a.length != 4) {
                    return false;
                }
            }
        }
        return true;
    }
}
