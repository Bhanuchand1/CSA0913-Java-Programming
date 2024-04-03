import java.util.Scanner;
class ParentClass {
    void printParent() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    void printChild() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        ChildClass childObj = new ChildClass();

        parentObj.printParent();
        childObj.printChild();
        childObj.printParent();
    }
}
