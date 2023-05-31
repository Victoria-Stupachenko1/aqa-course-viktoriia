package java.additional.syntax;

public class Child extends Parent {
    // 2. Initializing blocks
    public Child() {
        System.out.println("Child: Constructor");
    }

    {
        System.out.println("Child: Initializing block");
    }

    static {
        System.out.println("Child: Static initializing block");
    }
}
