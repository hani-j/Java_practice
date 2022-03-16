package ClassEx23_58;

class A1{
    int x = 100;
    public void aaa() {

    }
}

class B1 extends A1 {
    int y = 200;
    public void aaa() {
        System.out.println("y = " + y);
    }
}

public class ExtendsEx_02 {
    public static void main(String[] args) {
        A1 ap = new B1();
        System.out.println("x = " + ap.x);
        // System.out.println("y = " + ap.y);
        // 부모 위주로 처리해야함
        ap.aaa();

        B1 ap2 = new B1();
        System.out.println("x = " + ap2.x);
        System.out.println("y = " + ap2.y);
    }
}
