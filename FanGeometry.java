
public class FanGeometry {
    public static void findlenght(double x1, double y1, double x2, double y2){

        double pointslength;
        pointslength = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        System.out.println("total lenth of line is : " +pointslength);

    }
    public static void main(String [] args) {
        System.out.println("Welcome to Line comparision Computation Program on Master Branch");
        findlenght(3,5,7,5);
    }
}