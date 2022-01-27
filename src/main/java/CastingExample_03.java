public class CastingExample_03 {
    public static void main(String[] args){
        int intValue = 44032;
        char charValue = (char)intValue;
        System.out.println(charValue);
        System.out.println(charValue + 1);

        long longValue = 500;
        intValue = (int)longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int)doubleValue;
        System.out.println(doubleValue);

//      char : 2byte
//      long : 8byte
//      double : 8byte
    }
}
