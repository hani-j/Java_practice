public class PrintfEx_12 {
    public static void main(String[] args) {
        System.out.printf("100 + 100");
        System.out.printf("\n");

        System.out.printf("%d\n", 100 + 100); // decimal:정수
        System.out.printf("%5d\n", 123);
        System.out.printf("%05d\n", 123);

        System.out.printf("%d / %d = %f\n", 100, 200, 0.5);
        System.out.printf("%f\n", 123.45); // 밑으로 6자리
        System.out.printf("%7.1f\n", 123.45); // 7 : 자릿수 (뒤에서부터)
        System.out.printf("%7.3f\n", 123.45); // .3 : 소숫점 3자리까지


        System.out.printf("%c %c\n", 'a', 'A');

        System.out.printf("%s %s\n", "IT World", "Java");
        System.out.printf("%s\n", "Hi~~Java");
        System.out.printf("%10s\n", "Hi~~Java");
        System.out.printf("\t탭키\t연습\n");
        System.out.printf("글자가 \"강조\"되는 효과\n");
    }
}
