import java.util.Scanner;

public class ScannerEx_06 {
    public static void main(String[] args) {
        int a, b;
        int result;

        Scanner s = new Scanner(System.in);
        System.out.println("첫번째 계산할 값을 입력:");
        a = s.nextInt();
        System.out.println("두번째 계산할 값을 입력:");
        b = s.nextInt();

        result = a + b;
        System.out.println(a + "+" + b + "=" + result);
        result = a - b;
        System.out.println(a + "-" + b + "=" + result);
        result = a * b;
        System.out.println(a + "*" + b + "=" + result);
        result = a / b;
        System.out.println(a + "/" + b + "=" + result);

        s.close();
    }
}
