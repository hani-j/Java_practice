package ClassEx16_51;

import java.sql.SQLOutput;
import java.util.Scanner;

class Member {
    private String name;
    private String tel;

    Member(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }
    void disp() {
        System.out.println(name + "님의 전화번호는 " + tel + " 번 입니다.");
    }
}

public class Problem_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("회원 수 입력 : ");
        int inwon = in.nextInt();
        Member member[] = new Member[inwon];

        for (int i = 0; i < inwon; i++) {
            System.out.print(i + 1 + "번째 이름 : ");
            String name = in.next();
            System.out.print(i + 1 + "번째 전화번호 : ");
            String tel = in.next();

            member[i] = new Member(name, tel);
        }
        for (int i = 0; i< inwon; i++) {
            member[i].disp();
        }
    }
}