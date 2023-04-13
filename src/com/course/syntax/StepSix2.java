package com.course.syntax;

public class StepSix2 {
    public static void main(String[] args) {
        String sentence = "I like Java, but it is complicated sometimes";
        String reverse = new StringBuffer(sentence).reverse().toString();

         if (sentence.contains("Java")) {

             System.out.println(reverse);
         } else {
             System.out.println(sentence.toUpperCase());
         }


    }
}

