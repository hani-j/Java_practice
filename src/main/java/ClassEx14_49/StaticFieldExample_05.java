package ClassEx14_49;

class InstCnt2 {
    static int instNum = 100;
//  static 변수는 객체가 생성되기 이전에 별도의 메모리 공간에 할당
    InstCnt2() {
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}

public class StaticFieldExample_05 {
    public static void main(String[] args) {
        InstCnt2.instNum -= 15;
        System.out.println(InstCnt2.instNum);
    }
}
