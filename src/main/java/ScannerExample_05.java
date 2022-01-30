import java.util.Scanner;

public class ScannerExample_05 {
    public static void main(String[] args) {
        int a, b;
        int result;

        Scanner s = new Scanner(System.in);
        a = s.nextInt(); // 키보드로부터 정수 읽음
        b = s.nextInt();

        result = a+b;
        System.out.println(a + "+" + b + "=" + result);
        result = a-b;
        System.out.println(a + "-" + b + "=" + result);
        result = a*b;
        System.out.println(a + "*" + b + "=" + result);
        result = a/b;
        System.out.println(a + "/" + b + "=" + result);

        s.close();
    }
}
