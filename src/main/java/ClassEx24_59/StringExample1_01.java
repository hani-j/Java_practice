public class StringExample1_01 {

	public static void main(String[] args) {
		String str="Java Coffee";
		int len=str.length();
		
		for(int cnt=0;cnt<len;cnt++) {
			char ch=str.charAt(cnt);
			System.out.println(ch);
		}

	}

}
