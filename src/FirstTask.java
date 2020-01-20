import java.util.Scanner;

public class FirstTask {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        if (radius < 0) {
            System.out.println("Radius can't be negative");
        } else if (radius == 0) {
            System.out.println("It's point");
        } else {
                double pi = 3.14;
                double pRound = 2 * radius * pi;
                double sRound = pi * Math.pow(radius, 2);
                System.out.println(pRound);
                System.out.println(sRound);
        }
    }
}