package syntax;

import java.util.Arrays;

public class StepFive2 {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5, 6};
        int [] array2 = {7, 8, 9, 10, 11, 12};
        int [] arraySum = new int [array1.length + array2.length];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            arraySum[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
            arraySum[count++] = array2[j];

        }
        System.out.println(Arrays.toString(arraySum));



    }
}
