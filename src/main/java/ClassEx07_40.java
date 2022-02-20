class Car5 {
    String color;
    String gearType;
    int door;

    Car5() {
        this("white", "auto", 4);
    }
    Car5(String color) {
        this(color, "auto", 4);
    }
    Car5(String color, String gearType, int door) {
        this.color = color;
        this.gearType = "auto";
        this.door = 4;
    }
}

public class ClassEx07_40 {
    public static void main(String[] args) {
        Car5 c1 = new Car5();
        Car5 c2 = new Car5("blue");
        Car5 c3 = new Car5("black", "gear", 2);

        System.out.println("c1의 color = " + c1.color + ",gearType = " + c1.gearType + ",door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ",gearType = " + c2.gearType + ",door = " + c2.door);
        System.out.println("c3의 color = " + c3.color + ",gearType = " + c3.gearType + ",door = " + c3.door);
    }
}
