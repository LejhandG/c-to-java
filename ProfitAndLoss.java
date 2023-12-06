import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter cost price and selling price");
        int cp = ob.nextInt();
        int sp = ob.nextInt();
        int result;
        if(cp>sp) {
            result = cp-sp;
            System.out.println("The loss is: " + result);
        }
        else if(sp>cp) {
            result = sp-cp;
            System.out.println("The profit is: " + result);
        }
        else
            System.out.println("No profit,No loss");
    }
}