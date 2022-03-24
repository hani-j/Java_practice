package ClassEx23_58;

class ClassPrinter {
    public static void print(Object obj) { // 다형성
        System.out.println(obj.toString());
    }
}

class Point extends Object {
    private int xPos, yPos;

    Point(int x, int y){
        xPos = x;
        yPos = y;
    }

    public String toString() {
        String posInfo = "[x:" + xPos + ",y" + yPos + "]";

        return posInfo;
    }
}

public class ImplObjectPrintln_11 {
    public static void main(String[] args) {
        Point pos1 = new Point(1, 2);
        Point pos2 = new Point(5, 9);

        ClassPrinter.print(pos1);
        ClassPrinter.print(pos2);
    }
}
