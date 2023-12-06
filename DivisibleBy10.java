import java.util.Scanner;

public class DivisibleBy10 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = ob.nextInt();
        if(input%10 == 0)
            System.out.println(input + " is divisible by 10");
        else
            System.out.println(input + " is not divisible by 10");
    }
}