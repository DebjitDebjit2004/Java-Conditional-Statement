import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // iss me dono condition hi check hota hai
//        if (n % 2 == 0){
//            System.out.println("Even Number");
//        }
//        if (n % 2 != 0){
//            System.out.println("Odd Number");
//        }

        if (n % 2 == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
