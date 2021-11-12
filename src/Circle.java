public class Circle
{
    private double radius;
    private double  area;
    private double circumference;
    private final double pi = Math.PI;

    public void setRadius(double userRadius){
        this.radius = userRadius;
    }

    public void setArea(double userArea){
        this.area = userArea;
    }


    //Method to find the Area
    public double getArea(){
        //--> formula : (pi) (r) (r)
        double area = pi * radius * radius;

        return area;
    }

    //Method/Function to find Circumference
    public double getCircumference(){
        //--> formula : (2) (pi) (r)
        double circumference = 2 * pi * radius;

        return circumference;
    }

    //Method/Function to Diameter
    public double getDiameter(){
        //--> formula : d= (2) (r)
        double diameter = 2 * radius;

        return diameter;
    }

    //Method/Function for Radius
    public void setCircumference(double userCircumference){
        this.circumference = userCircumference;
    }

    public double getRadius(){
        //--> formula : ( sqrt( A/pi) )
        double radius = ( ( circumference ) / ( 2 * pi ) );

       // double Area = this

        return radius;
    }


    //print
    public void printCircleInfo()
    {
        System.out.println();
        System.out.println("__________________________");
        System.out.printf("Circle's Area: %.2f\n", getArea());
        System.out.printf("Circle's Circumference: %.2f\n", getCircumference());
        System.out.printf("Circle's Diameter: %.2f\n", getDiameter());
        System.out.printf("Circle's Radius: %.2f\n", getRadius());
        System.out.println("__________________________");
        System.out.println();
    }

}
