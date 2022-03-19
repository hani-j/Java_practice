package ClassEx23_58;

import java.util.Objects;

class Car {

}

class FireEngine extends Car {

}

public class InstancesofTest_06 {
    public static void main(String[] args) {
        Object fe = new FireEngine();

        if (fe instanceof FireEngine) {
            System.out.println("This is a FireEngine instance.");
        }
        if (fe instanceof Car) {
            System.out.println("This is a Car instance.");
        }
        if (fe instanceof Object) {
            System.out.println("This is an Object instance.");
        }
    }
}
