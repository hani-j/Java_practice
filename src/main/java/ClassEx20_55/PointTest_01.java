package ClassEx20_55;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        System.out.println("x:" + x + ",y:" + y);
        return "x:" + x + ",y:" + y;
    }
}

class Point3D extends Point{
    int z;

    Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    String getLocation() {
        System.out.println("x:" + x + ",y:" + y + ",z:" + z);
        return "x:" + x + ",y:" + y + ",z:" + z;
    }
}

public class PointTest_01 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
        String loc = p3.getLocation();
        System.out.println(loc);
    }
}
