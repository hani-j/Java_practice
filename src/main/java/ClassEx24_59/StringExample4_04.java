public class StringExample4_04 {

	public static void main(String[] args) {
		String str="자바를 열심히 하자";
		String str1=" Let it be. ";
		String str2=str1.trim();
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 9)); // endIndex-1
		
		System.out.println(str2);
		System.out.println(str2.concat("Speaking words of wisdom."));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.replace('e','a'));
		System.out.println(str1);
		System.out.println(str2);

	}

}
