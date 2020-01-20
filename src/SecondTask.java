import java.util.Scanner;

public class SecondTask {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        for (int x = 0; x < side; x++) {
            for (int y = 0; y < side; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
