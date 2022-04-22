package ClassEx24_59;

public class StringExample3_03 {

	public static void main(String[] args) {
		//String str1="자바";
		//String str2="자바";
				
		String str1=new String("자바");
		String str2=new String("자바");
				
		if(str1.equals(str2)) // 참조변수가 가리키는 값을 비교
			// String equals : 내용비교
			System.out.println("같음");
		else
			System.out.println("다름");
		
	}

}         
