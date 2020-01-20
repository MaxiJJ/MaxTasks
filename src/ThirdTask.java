import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int sideTr = sca.nextInt();
        for (int x = 0; x < sideTr; x++) {
            for (int y = 0; y < x+1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
