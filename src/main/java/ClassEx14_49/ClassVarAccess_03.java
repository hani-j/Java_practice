package ClassEx14_49;

class AccessWay {
    static int num = 0;
    int num2;

    AccessWay() {
        incrCnt();
    }
    public void incrCnt() {
        num++;
    }
}

public class ClassVarAccess_03 {
    public static void main(String[] args) {
        AccessWay way = new AccessWay();
        System.out.println(way.num);
        way.num++;
        System.out.println(way.num);
        System.out.println(AccessWay.num);
        System.out.println(way.num2);
        AccessWay.num++;
        System.out.println(AccessWay.num);
    }
}
