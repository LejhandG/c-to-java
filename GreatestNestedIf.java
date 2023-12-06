import java.util.Scanner;

public class GreatestNestedIf {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();
        if(a>b) {
            if(a>c) {
                System.out.println(a+" is greatest");
            }
            else
                System.out.println(c+" is greatest");
        }
        else if(b>a) {
            if(b>c) {
                System.out.println(b+" is greatest");
            }
            else
                System.out.println(c+" is greatest");
        }
    }
}