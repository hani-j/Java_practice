import java.util.Locale;

public class ToUpLoEx_28 {
    public static void main(String[] args) {
        String str = "  한글 ABCD efgh ";

        System.out.println("원 문자열==>["+ str + "]");
        System.out.println("대문자로==>["+ str.toUpperCase() + "]");
        System.out.println("소문자로==>["+ str.toLowerCase() + "]");
        System.out.println("앞뒤 공백제거==>["+ str.trim() + "]");
        System.out.println("원 문자열==>["+ str + "]");
        
        // str.toUpperCase() : 대문자로
        // str.toLowerCase() : 소문자로
        // str.trim() : 앞, 뒤 공백제거

        String result=" ";

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) != ' ')
                result+=str.substring(i,i+1);
        }
        System.out.println("원 문자열==>["+str+"]");
        System.out.println("원 문자열==>["+result+"]");
        System.out.println("앞뒤 공백제거==>["+result.trim()+"]");
        System.out.println("원 문자열==>["+str+"]");
    }
}
