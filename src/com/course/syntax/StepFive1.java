package com.course.syntax;

public class StepFive1 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;
        double average;

        for(int num : arr) {
            sum += num;
        }

        average = (double) sum / arr.length;
        System.out.println("Average value of the array is: " + average);
    }
}
