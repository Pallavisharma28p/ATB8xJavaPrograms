package Sept.ex20092024;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter first side of triangle");
        int side1= scanner.nextInt();
        System.out.println("Enter second side of triangle");
        int side2= scanner.nextInt();
        System.out.println("Enter third side of triangle");
        int side3= scanner.nextInt();

        if (side1==side2 && side2==side3)
        {
            System.out.println("the triangle is equilateral");
        }
       else if (side1 ==side2 || side1==side3)
        {
            System.out.println("the triangle is isosceles");
        }
       else{
            System.out.println("the triangle is scalene");
        }
    }
}
