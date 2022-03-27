package ClassEx23_58;

interface A3 {
    int w = 10;
    static int x = 20;
    final int y = 30;
    public static final int z = 40;
    // interface 에서 선언된 필드는 public static final

    void aaa(); // 안써도 기본이 public abstract (생략)
    public abstract void bbb();

}

class B3 implements A3 {
    public void aaa() { // 여기서는 public 생략하면 안됨
        System.out.println("aaa method");
    }
    public void bbb() {
        System.out.println("bbb method");
    }
}

public class RoundEx_14 {
    public static void main(String[] args) {
        // A1 ap = new A1(); 인터페이스 객체생성 안됨
        // A1.w = 100; 값 주는 것 안됨

        B3 bp = new B3();
        bp.aaa();
        bp.bbb();
    }
}
