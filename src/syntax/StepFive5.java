package syntax;

import java.util.Arrays;

public class StepFive5 {
    public static void main(String[] args) {
        int [] bubbles = {12, 4, 15, 0, 8, 1};

        boolean isSorted = false;
        int method;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < bubbles.length-1; i++) {
                if (bubbles[i] > bubbles[i+1]) {
                    isSorted = false;

                    method = bubbles[i];
                    bubbles[i] = bubbles[i+1];
                    bubbles[i+1] = method;

                }
            }
        }
        System.out.println(Arrays.toString(bubbles));
    }
}
