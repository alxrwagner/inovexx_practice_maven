package lesson_3;

import lesson_3.exceptions.MyArrayDataException;
import lesson_3.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "5", "8"},
                {"4", "2", "7", "8"},
                {"8", "3", "5", "0"},
                {"0", "3", "2", "t"}
        };
        int result = 0;
        try{
            result = counter(array);
        }catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static int counter(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int counter = 0;

        if (array.length != 4) {
            throw new MyArraySizeException("The number of lines in the array does not match 4!");
        }

        for(int i = 0; i < array.length; i++){
            if (array[i].length != 4){
                throw new MyArraySizeException("The number of columns in the array does not match 4!");
            }else {
                for (int j = 0; j < array[i].length; j++){
                    try {
                        counter += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("There is incorrect data in " + ++i + " column, in " + ++j + " cells!");
                    }
                }

            }
        }
        return counter;
    }
}
