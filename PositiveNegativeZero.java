import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = ob.nextInt();
        if(input>0)
            System.out.println("Number is positive");
        else if(input<0)
            System.out.println("Number is negative");
        else
            System.out.println("Number is zero");
    }
}