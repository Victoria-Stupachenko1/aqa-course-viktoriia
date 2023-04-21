package com.course.syntax;

import java.util.Arrays;

public class StepFourSort {
    public static void main(String[] args) {
        int [] arraySortAsc = { 92, 12, 0, 4, 345, 78, 2, 16};
        Arrays.sort(arraySortAsc);

        for (int list : arraySortAsc) {
            System.out.println(list + " " );
        }
    }
}
