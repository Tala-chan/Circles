import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Circle {
    Scanner inLine = new Scanner(System.in);
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }
    public void setRadius(){
        while(true) {
            System.out.println("Enter your radius here: ");
            try {
                radius = Double.parseDouble(inLine.next());
                break;
            } catch (Exception e) {
                System.out.println("Please enter numbers.");
            }
        }
        System.out.println();
        System.out.println("Your current radius is: " + getRadius());
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea(){
        System.out.print("Your current area is: ");
        return (getRadius()*getRadius()*Math.PI);
    }
    public double getCircumference(){
        System.out.print("Your current circumference is: ");
        return(getRadius()*2*Math.PI);
    }
}
