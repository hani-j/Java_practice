import java.util.Scanner;

public class SwitchEx_14 {
    public static void main(String[] args) {
        char grade;
        Scanner s = new Scanner(System.in);

        System.out.print("점수를 입력하세요:");
        int score = s.nextInt();

        switch(score / 10){
            case 10 :
            case 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7 :
                grade = 'C';
                break;
            case 6 :
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("학점은 " + grade + "입니다.");
        s.close();
    }
}
