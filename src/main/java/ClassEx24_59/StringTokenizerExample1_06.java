package ClassEx24_59;

import java.util.StringTokenizer;

public class StringTokenizerExample1_06 {
    public static void main(String[] args) {
        //StringTokenizer stok=new StringTokenizer("사과 배 복숭아"); // 공백을 기준
        StringTokenizer stok = new StringTokenizer("사과, 배, 복숭아", ","); // , 를 기준
        while(stok.hasMoreElements()) { // 요소들이 있는가
            String str = stok.nextToken(); // 공백을 기준으로 가져옴
            System.out.println(str);
        }
    }
}
