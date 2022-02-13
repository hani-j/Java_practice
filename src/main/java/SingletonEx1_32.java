public class SingletonEx1_32 {
    private static SingletonEx1_32 singleton= new SingletonEx1_32();

    private SingletonEx1_32(){

    }

    static SingletonEx1_32 getInstance() {return singleton;}
}
