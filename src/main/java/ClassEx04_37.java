class Car4 {
    private String color;
    private int speed;

    Car4() {

    }
    Car4(String color) {this.color = color;}
    Car4(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public String getColor() {return color;}

    public int getSpeed() {return speed;}
}

public class ClassEx04_37 {
    public static void main(String[] args) {
        Car4 myCar1 = new Car4();
        Car4 myCar2 = new Car4("빨강");
        Car4 myCar3 = new Car4("파랑", 30);

        System.out.println("자동차1의 색상은 " + myCar1.getColor()
        + "현재 속도는 " + myCar1.getSpeed());
        System.out.println("자동차2의 색상은 " + myCar2.getColor()
                + " 현재 속도는 " + myCar2.getSpeed());
        System.out.println("자동차3의 색상은 " + myCar3.getColor()
                + " 현재 속도는 " + myCar3.getSpeed());
    }
}
