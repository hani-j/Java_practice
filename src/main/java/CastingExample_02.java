public class CastingExample_02 {
    public static void main(String[] args){
        int intValue = 103029770;
        byte byteValue = (byte)intValue;
        int intValue2 = 10;
        double doubleValue = 5.5;

        System.out.println("byteValue=" + byteValue);
        System.out.println("intValue=" + intValue);

        double result = intValue2 + doubleValue;
        System.out.println(result);
        System.out.println(intValue2);
//      byte : 1byte
//      int : 4byte
//      double : 8byte
    }
}
