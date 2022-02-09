public class IndexofEx_26 {
    public static void main(String[] args) {
        String str = "Java 공부중, Java 열공하자";

        System.out.println("문자열==>" + str);

        System.out.print("제일 처음 나오는 Java 위치 ==>");
        System.out.println(str.indexOf("Java"));
        System.out.print("마지막에 나오는 Java 위치 ==>");
        System.out.println(str.lastIndexOf("Java"));
        // indexOf() : 첫 문자열 찾기
        // lastIndexOf() : 마지막 문자열 찾기
    }
}
