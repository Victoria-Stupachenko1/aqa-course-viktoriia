package syntax;

public class StepSix2 {
    public static void main(String[] args) {
        String sentence = "I like Java, but it is complicated sometimes";
        if (sentence.toLowerCase().contains("java")) {

            String reversedSentence = new StringBuilder(sentence).reverse().toString();
            System.out.println(reversedSentence);
        } else {

            String[] second = sentence.split(" ");
            for (int i = 0; i < second.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(second[i].toUpperCase() + " ");
                } else {
                    System.out.print(second[i] + " ");


                }
            }
        }
    }
}