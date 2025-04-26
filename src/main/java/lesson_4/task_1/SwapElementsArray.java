package lesson_4.task_1;

public class SwapElementsArray<T> {

    public static <T> void swap(T[] array, int numCellFirst, int numCellSecond){
        T element = array[numCellFirst];
        array[numCellFirst] = array[numCellSecond];
        array[numCellSecond] = element;
    }

    public static <T> void swap(T[] array, T firstElement, T secondElement){
        int firstIndex = -1;
        int secondIndex = -1;

        for(int i = 0; i < array.length; i++){
            if (array[i].equals(firstElement) && firstIndex < 0){
                firstIndex = i;
            } else if (array[i].equals(secondElement) && secondIndex < 0) {
                secondIndex = i;
            }
        }

        if(firstIndex < 0 || secondIndex < 0){
            System.out.println("One or more elements are missing from the array!");
        }else{
            swap(array, firstIndex,secondIndex);
        }
    }
}
