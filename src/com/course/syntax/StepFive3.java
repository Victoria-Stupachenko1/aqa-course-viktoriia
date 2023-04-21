package com.course.syntax;

public class StepFive3 {
    public static void main(String[] args) {
        int[] array3 = {1, 87, 0, -12, 4443};

        int max = array3[0];

        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > max) {
                max = array3[i];
            }
        }

        System.out.println("The largest value in the array is: " + max);
    }
}
