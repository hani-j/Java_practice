public class SignOpEx_08 {
    public static void main(String[] args) {
        short s = 100; // short : 2byte
        // short s2 = 0;
        int s2 = 0;

        System.out.println("s=" + s);
        s = -100;
        System.out.println("s=" + s);
        s2 = -s;
        // - : 연산 => 4byte 연산으로 됨
        System.out.println("s2=" + s2);
    }
}
