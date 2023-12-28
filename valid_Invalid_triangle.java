import java.util.Scanner;

public class valid_Invalid_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st side: ");
        int a = sc.nextInt();

        System.out.print("Enter 2st side: ");
        int b = sc.nextInt();

        System.out.print("Enter 3st side: ");
        int c = sc.nextInt();

        if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)){
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
