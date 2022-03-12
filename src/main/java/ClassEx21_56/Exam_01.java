package ClassEx21_56;

import java.io.IOException;
import java.util.Scanner;

class Member2 {
    protected String name; // 상속 받은 자식 클래스에서만 접근 허용
    protected String tel;

    Member2(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    void disp() {
        System.out.println(name + "님의 전화 번호는 " + tel + "번 입니다.");
    }
}

class Member3 extends Member2 {
    private String addr;

    Member3(String name, String tel, String addr) {
        super(name, tel);
        this.addr = addr;
    }
    public String getAddr() {return addr;}
    public void setAddr(String addr) {this.addr = addr;}
    public void disp() {
        System.out.println(name + "님의 전화번호는 " + tel + "번 입니다.");
    }
}

class MemberPro{
    private Member3 mb[]; // Member3를 배열로 선언
    private int po;

    Scanner in = new Scanner(System.in);

    public MemberPro() { // 한번만 실행
        mb = new Member3[5];
        po = 0;
    }
    public void input() {
        System.out.print("이름을 입력 : ");
        String name = in.next();
        System.out.print("전화번호를 입력 : ");
        String tel = in.next();
        System.out.print("주소를 입력 : ");
        String addr = in.next();
        mb[po] = new Member3(name, tel, addr);
        po++; // 실행할 때마다 증가
    }

    public void view() {
        for(int i = 0; i < po; i++) {
            mb[i].disp();
        }
    }

    public void delete() {
        System.out.print("삭제할 회원의 이름 : ");
        String name = in.next();

        for (int i = 0; i < po; i++) {
            if (name.equals(mb[i].getName())) {
                for(int j = i; j < po-1; j++) {
                    mb[j] = mb[j + 1];
                }
                po--;
                System.out.println(name + "회원님을 삭제하였습니다.");
                return;
            }
        }
        System.out.println(name + "님은 저희 회원이 아닙니다.");
    }

    public void edit() {
        System.out.print("수정할 회원의 이름 입력 : ");
        String name = in.next();
        for (int i = 0; i < po; i++) {
            if (name.equals(mb[i].getName())) {
                System.out.println("현재" + name + "님의 전화번호는 " + mb[i].getTel() + "번 입니다.");
                System.out.print("수정할 전화번호 : ");
                String tel = in.next();
                mb[i].setTel(tel);
                System.out.println(name + "님의 전화번호를 수정하였습니다.");
                return;
            }
        }
        System.out.println(name + "님은 저희 회원이 아닙니다.");
    }

    public void exit() {
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }
}

public class Exam_01 {
    public static void main(String[] args) throws IOException {
        MemberPro pro = new MemberPro();

        while(true) {
            System.out.println("1.입력 2.출력 3.삭제 4.수정 5.종료");
            int select = System.in.read() - 48;
            System.in.skip(2);

            switch(select) {
                case 1:
                    pro.input();
                    break;
                case 2:
                    pro.view();
                    break;
                case 3:
                    pro.delete();
                    break;
                case 4:
                    pro.edit();
                    break;
                case 5:
                    pro.exit();
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
