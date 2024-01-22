public class Point2 {
    int x;
    int y;

    Point2(int x, int y) {this.x = x; this.y = y; }

    void setX(int x ) {this.x = x;}
    void setY(int y) {this.y = y;}

    int getX() { return x;}
    int gety() {return y;}
}

class Point3 extends Point2 {
    int z;
    Point3(int x, int y, int z) {super(x, y); this.z = z;}
    void setZ(int z) {this.z = z; }
    int getZ() {return z;}
}

class PointTester {
    public static void main(String[] args) {

        Point2 a = new Point2(10, 15);
        Point3 b = new Point3(20, 30, 40);

        System.out.printf("a = (%d.%d)\n",  a.getX(), a.gety());
        System.out.printf("b = (%d,%d,%d)\n", b.getX(),b.gety(),b.getZ());
    }
}