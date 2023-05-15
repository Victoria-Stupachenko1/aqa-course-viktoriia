package Collections;

import java.util.Set;
import java.util.TreeSet;

public class Step4Task1 {
    private Set<Integer> Step4Task1;

    public Step4Task1() {
        Step4Task1 = new TreeSet<> ( );
    }

    public void addElement(int element) {
        Step4Task1.add (element);
    }

    public Set<Integer> getSortedCollection() {
        return Step4Task1;
    }

    public static void main(String[] args) {
        Step4Task1 example = new Step4Task1 ( );

        example.addElement (5);
        example.addElement (2);
        example.addElement (10);
        example.addElement (1);

        Set<Integer> sortedCollection = example.getSortedCollection ( );

        System.out.println ("Elements in the sorted collection:");
        for (int element : sortedCollection) {
            System.out.println (element);
        }
    }
}