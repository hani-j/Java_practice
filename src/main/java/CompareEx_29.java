public class CompareEx_29 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java IT Language";

        System.out.println("원 문자열1 ==> ["+ str1 + "]");
        System.out.println("원 문자열1 ==> ["+ str2 + "]");

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("Java"));

        // str.compareTo() : 다른 첫 문자의 차이값
        // str.contains("") : 문자열을 포함하고 있는지 true/false
    }
}
