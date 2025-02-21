package classi;

public class Circle {

    private Point center;
    private double radius;
    
    public Circle() {
        center = new Point();
        radius = 1;
    }
    
    public Circle(double x, double y, double r) {
        center = new Point(x,y);
        radius = r;
    }
    
    public Circle(Point p, double r) {
        center = p;     
        radius = r;
    }
    
    public Point getCenter() {
        return center;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public String toString() {
        return "Circle[" + center + ", " + radius + "]";
    }
}
