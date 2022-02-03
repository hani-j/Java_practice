public class Ex_13 {
    public static void main(String[] args) {
        int a;
        double b;

        a = (int)123.45;
        System.out.printf("a의 값 ==> %d\n", a);

        b = 200;
        System.out.printf("b의 값 ==> %5.1f\n", b);

        a=100; // a=100
        a=a+200; // a=200
        a=a+200; // a=300  ==> a의 값 ==> 300
        System.out.printf("a의 값 ==>%d\n",a);
    }
}
