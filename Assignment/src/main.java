import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner Scannerobject = new Scanner(System.in);
        System.out.println("enter the height and width of rectangle");
        int widthOfRectangle = Scannerobject.nextInt();
        int heightOfRectangle = Scannerobject.nextInt();

        //calling the Rectangle  class function with Shape class object
        Shape Shapeobject = new Rectangle();
        Shapeobject.setWidthOfShape(widthOfRectangle);
        Shapeobject.setHeightofShape(6);
        System.out.println("area of rectangle = " + Shapeobject.getArea());


        //calling the Square function class with same object
        Shapeobject = new Square();
        System.out.println("enter the height and width of square");
        int sideofSquare = Scannerobject.nextInt();
        Shapeobject.setHeightofShape(sideofSquare);
        System.out.println("area of Square = " + Shapeobject.getArea());


    }
}
