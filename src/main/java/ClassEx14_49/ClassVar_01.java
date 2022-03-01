package ClassEx14_49;

class InstCnt{
    static int instNum=0;
    // int instNum=0;
    // static : 모든 변수가 선언된 클래스의 모든 객체가 공유
    //          메모리 공간에 하나만 존재, 어디서나 접근이 가능
    //          static 변수도 public 으로 선언되어야 함
    //          정적필드, 정적메서드, 정적초기화 블록에서 선언 가능

    public InstCnt() {
        instNum++;
        System.out.println("인스턴스 생성:"+instNum);
    }
}

public class ClassVar_01 {
    public static void main(String[] args) {
        InstCnt cnt1=new InstCnt();
        InstCnt cnt2=new InstCnt();
        InstCnt cnt3=new InstCnt();

    }
}
