import java.util.*;
public class FanGeometry {
    public double findlenghtL1(){
        Scanner scnr =new Scanner(System.in);

        System.out.println("enter first line cordinates");
        System.out.println("enter x1 value");
        double x1 = scnr.nextDouble();
        System.out.println("enter y1 value");
        double y1 = scnr.nextDouble();
        System.out.println("enter x2 value");
        double x2 = scnr.nextDouble();
        System.out.println("enter y2 value");
        double y2 = scnr.nextDouble();

        return  Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
    }
    public double findlenghtL2(){

        Scanner scnr =new Scanner(System.in);
        System .out.println("enter second line cordinates");
        System.out.println("enter x1 value");
        double x1 = scnr.nextDouble();
        System.out.println("enter y1 value");
        double y1 = scnr.nextDouble();
        System.out.println("enter x2 value");
        double x2 = scnr.nextDouble();
        System.out.println("enter y2 value");
        double y2 = scnr.nextDouble();

        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
    }

    public void check() {
        double lengthL2;
        double lengthL1;
        FanGeometry obj = new FanGeometry();

        lengthL1 = obj.findlenghtL1();
        lengthL2 = obj.findlenghtL2();
        if (lengthL1 == lengthL2) {
            System.out.println("Lines are equals ");
        } else {
            System.out.println("Lines are not equals");
            if (lengthL1 > lengthL2) {
                System.out.println("second Line is lesser ");
            } else
                System.out.println("second line is greater ");
        }
    }

    public static void main(String [] args) {
        System.out.println("Welcome to Line comparision Computation Program on Master Branch");
            FanGeometry obj=new FanGeometry();
            obj.check();
        }
    }
