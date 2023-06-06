package collections;

import java.util.Set;
import java.util.TreeSet;

public class Step4Task1 {

    public static void main(String[] args) {
        Set <String> treeSet = new TreeSet<>();

        treeSet.add("Alan");
        treeSet.add("Amanda");
        treeSet.add("Anna");
       treeSet.add("Alla");

        for (String i : treeSet) {
            System.out.println(i);
        }
        System.out.println("Main list: " + treeSet);
        treeSet.add("Borys");
            System.out.println("Added another value: " + treeSet);
        }
    }