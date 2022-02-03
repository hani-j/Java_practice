public class InDeEx_09 {
    public static void main(String[] args) {
        int a = 5, b = 5;
        int c = 0;

        c = ++a;
        c = b++;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

        c = a++ + ++b;
        System.out.println("c=" + c);
        System.out.println("a=" + a);
    }
}
