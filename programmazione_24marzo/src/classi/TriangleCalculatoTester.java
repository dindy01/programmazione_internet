package classi;

public class TriangleCalculatoTester {

    public static void main(String[] args) {
        
        double a = 20;
        double b = 20;
        double g = 50;
        
        TriangleCalculator tri = new TriangleCalculator(a, b, g);
        System.out.println("Sides: " + tri.getA() + ", " + tri.getB() + 
                            ", " + tri.getC());
        System.out.println("Angles: " + tri.getAlpha() + ", " + tri.getBeta() 
                            + ", " + tri.getGamma());
        System.out.println("Angle sum is " + tri.checkAngleSum());
                            
    }

}
