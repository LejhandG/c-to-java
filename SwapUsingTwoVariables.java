import java.util.Scanner;

public class SwapUsingTwoVariables {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers to swap");
        a = ob.nextInt();
        b = ob.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The swapped variables are : a=" + a + " b=" + b);
    }
}