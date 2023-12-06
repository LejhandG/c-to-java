import java.util.Scanner;

public class SwitchCaseOperators {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = ob.nextInt();
        int b = ob.nextInt();
        System.out.println("Enter the operation:\n+ for addition\n- for subtraction\n* for multiplication\n/ for division");
        char operation = ob.next().charAt(0);
        switch(operation) {
            case '+':
                System.out.println("The sum is: " + (a+b));
                break;
            case '-':
                System.out.println("The difference is: " + (a-b));
                break;
            case '*':
                System.out.println("The multiplication is: " + (a*b));
                break;
            case '/':
                System.out.println("The division is: " + (a/b));
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}