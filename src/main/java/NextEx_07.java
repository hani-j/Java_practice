import java.util.Arrays;
import java.util.Scanner;

public class NextEx_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int kor, eng;
        int total;

        System.out.print("이름을 입력:");
        String name = s.next(); // next() : String(문자열) class
        System.out.print("국어 점수를 입력:");
        kor = s.nextInt();
        System.out.print("영어 점수를 입력:");
        eng = s.nextInt();
        total = kor + eng;

        System.out.println(name + "님의 총점은" + total + "점입니다");
    }
}
