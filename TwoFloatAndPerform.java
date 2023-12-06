import java.util.Scanner;

public class TwoFloatAndPerform {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        float a,b,result;
        System.out.println("Enter two float numbers");
        a = ob.nextFloat();
        b = ob.nextFloat();
        result = a+b;
        System.out.println("Addition: " + result);
        result = a-b;
        System.out.println("Subtraction: " + result);
        result = a*b;
        System.out.println("Multiplication: " + result);
        result = a/b;
        System.out.println("Division: " + result);
    }
}