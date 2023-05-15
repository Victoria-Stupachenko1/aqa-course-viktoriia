package JavaAdditionalSyntax;

public class Parent {
    // 2. Initialization Blocks
    public Parent() {
        System.out.println ("Parent: Constructor");
    }

    {
        System.out.println ("Parent: Initializing block");
    }

    static {
        System.out.println ("Parent: Static initializing block");
    }
}
