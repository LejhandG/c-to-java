//Enter distance and time and find speed
import java.util.Scanner;

public class SpeedDistanceTime {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int distance,time;
        System.out.println("Enter the distance and time");
        distance = ob.nextInt();
        time = ob.nextInt();
        System.out.println("The speed is: " + distance/time);
    }
}