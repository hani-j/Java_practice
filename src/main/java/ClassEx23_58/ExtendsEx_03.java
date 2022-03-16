package ClassEx23_58;

class A2{
    private int x = 100;
    private int y = 200;

    public void setX(int x) {this.x = x;}

    public void setY(int y) {this.y = y;}

    public void disp() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

class B2 extends A2 {
    private int y = 300;
    private int z = 400;

    public void setY(int y) {this.y = y;}

    public void setZ(int z) {this.z = z;}

    public void disp() {
        super.disp();
        System.out.println("y = " + y + ", Z = " + z);
    }
}

public class ExtendsEx_03 {
    public static void main(String[] args) {
        A2 ap = new B2();
        ap.disp();
        System.out.println();
        ap.setX(1);
        ap.disp();
        System.out.println();
        ap.setY(2);
        ap.disp();
    }
}
