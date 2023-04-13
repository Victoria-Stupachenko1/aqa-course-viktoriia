package com.course.syntax;

public class StepTwo {
    public static void main(String[] args) {
        int a = 14;
        int b = 12;
        int c = 12;
        int p = (a + b + c)/2;

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(s);

    int a1 = 2;
    int b1 = 3;
    int c1 = 4;
    int d = 6;

    int e = 2 * a++;
    int f = 2 * ++b;
    int g = 2 * c--;
    int h = 2 * --d;

        System.out.println("Постфиксная форма инкремента " + e);
        System.out.println(a1);
        System.out.println("Префиксная форма инкремента " + f);
        System.out.println(b1);
        System.out.println("Постфиксная форма декремента " + g);
        System.out.println(c1);
        System.out.println("Префиксная форма декремента " + h);
        System.out.println(d);



}


}

