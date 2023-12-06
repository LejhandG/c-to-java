//Find the area of square and rectangle

import java.util.Scanner;

public class AreaOfSquareRectangle {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int side,length,breadth;
        System.out.println("Enter the side of square");
        side = ob.nextInt();
        System.out.println("Enter the length and breadth of the rectangle");
        length = ob.nextInt();
        breadth = ob.nextInt();
        System.out.println("The area of square is: " + side*side);
        System.out.println("The area of rectangle is: " + length*breadth);
    }
}