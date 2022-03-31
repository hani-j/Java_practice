package ClassEx23_58;

interface  I21 {
    public abstract void methodB();
}

class B21 implements I21 {
    public void methodB() {
        System.out.println("method in B class");
    }
}

class InstanceManager {
    public static I21 getInstance() {
        return new B21();
    }
}

class A21 {
    public void methodA() {
        I21 i = InstanceManager.getInstance(); // 다형성
        i.methodB();
    }
}

public class InterfaceTest2_18 {
    public static void main(String[] args) {
        A21 a = new A21();
        a.methodA();
    }
}
