import java.util.Scanner;

public class AcceptMarksAndGrade {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects");
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();
        int d = ob.nextInt();
        int e = ob.nextInt();
        float percentage = (a+b+c+d+e)/5;
        System.out.println("Your percentage is: " + percentage);
        if(percentage>=90)
            System.out.println("Your grade is A");
        else if(percentage>=80)
            System.out.println("Your grade is B");
        else if(percentage>=70)
            System.out.println("Your grade is C");
        else if(percentage>=60)
            System.out.println("Your grade is D");
        else if(percentage>=40)
            System.out.println("Your grade is E");
        else
            System.out.println("Your grade is F");
    }
}