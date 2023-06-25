import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç basamaklı üçgen oluşturmak istiyorsunuz ? ");
        int m = scan.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * m - 1; k >= (2 * i + 1); k--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}