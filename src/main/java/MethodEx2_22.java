import java.util.Scanner;

public class MethodEx2_22 {
    public static void main(String[] args) {
        disp();
        output(10, 20, 30);
        int sum = hap(10, 20);
        System.out.println("sum="+sum);
        int su1 = input();
        int su2 = input();
        int su3 = hap(su1, su2);
        output(su1, su2, su3);
    }

    public static void disp(){
        System.out.println("2022.02.08 메서드 공부중");
    }

    public static void output(int a, int b, int c){
        System.out.printf("%d+%d=%d\n", a, b, c);
    }

    public static int hap(int a, int b) {return a+b;}

    public static int input() {
        Scanner s = new Scanner(System.in);
        System.out.print("수를 입력: ");
        int su = s.nextInt();
        return su;
    }
}
