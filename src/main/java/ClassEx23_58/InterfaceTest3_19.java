package ClassEx23_58;

interface Movable {
    public void moveTo(int x, int y);
    public void moveBy(int xOffset, int yOffset);
}

interface  Transformable extends Movable {
    public void resize(int width, int height);
}

class Rectangle implements Transformable {
    int x, y, width, height;

    Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveBy(int xOffset, int yOffset) {
        this.x += xOffset;
        this.y += yOffset;
    }
}

public class InterfaceTest3_19 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(100, 200, 10, 10);
        printRectangle(obj);

        obj.moveTo(25, 35);
        printRectangle(obj);
        obj.moveBy(-5, -5);
        printRectangle(obj);
        obj.resize(30, 30);
        printRectangle(obj);
    }

    public static void printRectangle(Rectangle obj) {
        System.out.printf("사각형: 위치(%d,%d)크기(%d*%d)%n",obj.x,obj.y,obj.width,obj.height);
    }
}
