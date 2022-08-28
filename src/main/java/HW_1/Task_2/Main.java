package HW_1.Task_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {5,6,3,2,5,1,4,9};

        assert myArray.length>=0: "myArray.length <= 0";

        System.out.println("Неотсортированный массив: ");
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = 0; j < myArray.length-1-i; j++) {
                if(myArray[j]>myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }

        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(myArray));
    }
}
