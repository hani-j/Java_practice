import java.util.Scanner;

public class CharAtEx_15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;

        System.out.printf("첫번째 수를 입력하세요:");
        a = s.nextInt();

        System.out.printf("계산할 연산자를 입력하세요:");
        ch = s.next().charAt(0);

        System.out.printf("두번째 수를 입력하세요:");
        b = s.nextInt();

        if(ch == '+')
            System.out.printf("%d + %d = %d입니다.\n", a, b, a+b);
        if(ch == '-')
            System.out.printf("%d - %d = %d입니다.\n", a, b, a-b);
        if(ch == '*')
            System.out.printf("%d * %d = %d입니다.\n", a, b, a*b);
        if(ch == '/')
            System.out.printf("%d / %d = %d입니다.\n", a, b, a/b);
        if(ch == '%')
            System.out.printf("%d % %d = %d입니다.\n", a, b, a%b);
        System.out.println("전부 비교합니다.");
        s.close();
    }
}
