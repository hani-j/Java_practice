class Car2 {
    // private String color;
    String color;
    int speed;

    void upSpeed(int value) {speed = speed + value;}

    void downSpeed(int value) {speed = speed - value;}

    String getColor() {return color;}

    int getSpeed() {return speed;}
}

public class ClassEx02_35 {
    public static void main(String[] args) {
        Car2 myCar1 = new Car2();
        myCar1.color = "빨강";
        myCar1.speed = 0;

        myCar1.upSpeed(30);
        System.out.println(myCar1.color);
        System.out.println(myCar1.getColor());
    }
}

// private : myCar1.color 로 호출할 수 없음 (캡슐화)
//           myCar1.getColor() 로 호출할 수 있음