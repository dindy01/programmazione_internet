package classi;

public class TriangleCalculator {
    
    private double a, b, c;
    private double alpha, beta, gamma;
    private double perimeter, area;
    
    public TriangleCalculator( double sideA, double sideB, double g) {
        
        double s;
        a = sideA;
        b = sideB;
        c = Math.sqrt(a*a + b*b - 2*a*b * Math.cos(gamma));
        alpha = Math.acos((b*b + c*c* - a*a) / (2*b*c));
        beta = Math.acos((c*c + a*a - b*b) / (2 * c*a));
        
        perimeter = a+b+c;
        
        s = perimeter / 2;
        
        area = Math.sqrt(s * (s - a) * (s - b) * (s -c));
    }
    
    public double getA() {
        return a;
    }
    
    public double getB() {
        return b;
    }
    
    public double getC() {
        return c;
    }
    
    public double getAlpha() {
        return alpha;
    }
    
    public double getBeta() {
        return beta;
    }
    
    public double getGamma() {
        return gamma;
    }
    
    public double getPerimeter() {
        return perimeter;
    }
    
    public double getArea() {
        return area;
    }
    
    public double checkAngleSum() {
        return alpha + beta + gamma;
    }
}
