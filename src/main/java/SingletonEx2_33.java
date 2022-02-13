public class SingletonEx2_33 {
    public static void main(String[] args) {
        SingletonEx1_32 obj1 = SingletonEx1_32.getInstance();
        SingletonEx1_32 obj2 = SingletonEx1_32.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체 입니다.");
        }else {
            System.out.println("다른 singleton 객체 입니다.");
        }
    }
}
