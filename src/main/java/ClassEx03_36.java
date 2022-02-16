class Car3 {
    private String color;
    private int speed;

    Car3() {
        color = "빨강";
        speed = 0;
    }

    String getColor() {return color;}
    int getSpeed() {return  speed;}
    void setColor(String color) {this.color = color;}
    void setSpeed(int speed) {this.speed = speed;}
}

// Car3() {} : 기본 생성자, 무조건 실행, 메서드의 한 종류, 반환타입x, 객체 생성시 자동 호출

public class ClassEx03_36 {
    public static void main(String[] args) {
        Car3 myCar1 = new Car3();

        System.out.println("자동차 1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 "
                + myCar1.getSpeed() + "km 입니다.");

        Car3 myCar2 = new Car3();
        myCar2.setColor("파랑");
        myCar2.setSpeed(10);

        System.out.println("자동차 2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 "
                + myCar2.getSpeed() + "km 입니다.");
    }
}
