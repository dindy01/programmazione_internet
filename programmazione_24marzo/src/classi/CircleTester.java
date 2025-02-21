package classi;

public class CircleTester {

    
    public CircleTester() {
        
    }
    
    public void doTest() {
        Point center = new Point(3, 4);
        Circle c1 = new Circle();
        Circle c2 = new Circle(center, 5);
        Circle c3 = new Circle (3, 4, 5);
        
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        
        double radius = c2.getRadius();
        double x = c2.getCenter().getX();
        double y = c2.getCenter().getY();
        
        System.out.println("Radius = " + radius);
        System.out.println("Center x = " + x);
        System.out.println("Center y = " + y);
    }
}
