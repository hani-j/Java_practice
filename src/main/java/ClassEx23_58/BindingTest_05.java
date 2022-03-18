package ClassEx23_58;

class Parent2 {
    int x = 100;

    public void method() {
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2 {
    int x = 200;

    public void method() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}

public class BindingTest_05 {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println("p.x = " + p.x); // 100
        p.method(); // x = 200 s.x = 100 t.x = 200
        System.out.println();
        System.out.println("c.x = " + c.x); // 200
        c.method(); // x = 200 s.x = 100 t.x = 200
    }
}
