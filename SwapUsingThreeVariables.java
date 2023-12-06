import java.util.Scanner;

public class SwapUsingThreeVariables {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a,b,temp;
        System.out.println("Enter two numbers to swap");
        a = ob.nextInt();
        b = ob.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped variables are a=" + a + " b=" + b);
    }
}