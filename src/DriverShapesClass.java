import java.util.Scanner;

public class DriverShapesClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Circle circleObj = new Circle();

        System.out.print("Enter Circle's Radius: ");
        circleObj.setRadius(sc.nextDouble());

        //System.out.print("Enter Circle's Area: ");
        //circleObj.setArea(sc.nextDouble());

        System.out.print("Enter Circle's Circumference: ");
        circleObj.setCircumference(sc.nextDouble());

        circleObj.printCircleInfo();

    }

}
