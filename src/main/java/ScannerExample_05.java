import java.util.Scanner;
// java.util 안에 Scanner 라는 class를 import하겠다

public class ScannerExample_05 {
    public static void main(String[] args) {
        int a, b;
        int result;

        Scanner s = new Scanner(System.in);
        // 메모리에 무언가를 만들어라
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
