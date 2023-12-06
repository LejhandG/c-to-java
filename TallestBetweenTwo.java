import java.util.Scanner;

public class TallestBetweenTwo {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter heights of two people");
        float a = ob.nextFloat();
        float b = ob.nextFloat();
        if (a > b)
            System.out.println("A is taller");
        else if (b > a)
            System.out.println("B is taller");
        else
            System.out.println("Both are equal");
    }
    }