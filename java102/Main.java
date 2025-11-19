package java102;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 3);
        System.out.println("x: " + point.x + "y: " + point.y);
        
        Point xTranslation = point.translateX(3); // should be (7, 3)
        Point yTranslation = point.translateY(-7); // should be (4, -4)
        Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);
        
        Point a = new Point(1,1);
        Point b = new Point(4,5);   
        System.out.println("\npoint a: " + a + "\npoint b: " + b + " \ndistance between a and b: " + Point.distance(a, b));
    }
 }