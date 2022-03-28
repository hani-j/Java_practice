package ClassEx23_58;

interface A4 {
    int x = 100;

    class B3 { // static (정적) 중첩 클래스
        private int y;

        public B3() {
            this.y = 200;
        }

        public void disp() {
            System.out.println("x = " +x);
            System.out.println("x = " + A4.x);
            System.out.println("y = " +y);
        }
    }
}

public class RoundEx_15 {
    public static void main(String[] args) {
        A4.B3 bp = new A4.B3();
        bp.disp();
    }
}
