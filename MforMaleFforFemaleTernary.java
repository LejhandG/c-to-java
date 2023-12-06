import java.util.Scanner;

public class MforMaleFforFemaleTernary {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter M or F");
        char input = ob.next().charAt(0);
        String result = input=='M' ? "Male" : "Female";
        System.out.println(result);
    }
}
