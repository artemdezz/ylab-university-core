package HW_1.Task_1;
public class Main {

    public static void main(String[] args) {

        int row = 5;
        int column = 5;

        int[][] myArray = new int[row][column];

        System.out.println("Массив: "+row+"*"+column);
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (1 + System.nanoTime() % (100 - 1));
                System.out.print("\u001B[32m"+myArray[i][j] + " "+"\u001B[0m");
            }
            System.out.println();
        }

        int min = myArray[0][0];
        int max = myArray[0][0];
        double avg = 0;
        for (int[] anArr : myArray) {
            for (int anAnArr : anArr) {
                if (anAnArr < min) {
                    min = anAnArr;
                }

                if (anAnArr > max) {
                    max = anAnArr;
                }

                avg += anAnArr;
            }
        }
        avg = avg/(row*column);

        assert min<=max: "min >= max";
        assert avg!=0: "avg = 0";

        System.out.println("Минимум: "+min);
        System.out.println("Максимум: "+max);
        System.out.println("Среднее: "+avg);
    }
}
