public class StaticEx_30 {
    static String company = "SamSung";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}
