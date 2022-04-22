package ClassEx25_60;

class Circle extends Object{
    int radius;

    Circle(int radius) {this.radius = radius;}

    public boolean equals(Object obj) {
        if (!(obj instanceof  Circle))
            return false;
        Circle circle = (Circle) obj;
        if (this.radius == circle.radius)
            return true;
        else
            return false;
    }
}

public class ObjectExample2_02 {
    public static void main(String[] args) {
        Circle obj1 = new Circle(5);
        Circle obj2 = new Circle(5);
        // Object 클래스의 equals 메서드는 두 객체를 비교할 때 객체의 필드 값이 아니라
        // 참조값을 가지고 비교한다.
        if (obj1.equals(obj2))
            System.out.println("같음");
        else
            System.out.println("다름");
    }
}
