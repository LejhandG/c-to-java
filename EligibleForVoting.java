import java.util.Scanner;

public class EligibleForVoting {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = ob.nextInt();
        if(age>=18)
            System.out.println("You can vote");
        else
            System.out.println("You cannot vote! You can vote in " + (18-age) + " years");
    }
}