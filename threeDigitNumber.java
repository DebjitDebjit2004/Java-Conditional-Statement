import java.util.Scanner;

public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 99 && n < 1000){
            System.out.println("It is a Three Digit Number");
        } else {
            System.out.println("It is not Three Digit Number");
        }
    }
}
