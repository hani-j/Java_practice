import java.util.Scanner;

public class StrEx_27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        System.out.print("문자열을 입력하세요:");
        str = s.nextLine();

        strRep = str.replace(" ", "&");
        strSub = str.substring(3, 8);
        strAry = str.split(" ");

        System.out.println("입력 문자열 출력 ==> " + str);
        System.out.println("바꾼 문자열 출력 ==> " + strRep);
        System.out.println("입력 문자열 출력 ==> " + str);
        System.out.println("일부 문자열 출력 ==> " + strSub);

        System.out.println("str.length():" + str.length());
        System.out.println("strAry.length():" + strAry.length);

        for (int i=0; i< strAry.length; i++)
            System.out.println("분리할 문자열" + i + "==>" + strAry[i]);

        s.close();

        // replace(target, replacement) : t를 r로 대체
        // substring(a, b) : index a 부터 b-1 까지
        // split(기준) : 기준으로 자르기
        // 배열.length : 문자열의 길이는 (str.length())
    }
}
