import java.util.Scanner;

public class greatestThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        // Nested If Else
        if (a > b){
            if (a > c) { // a>b>c or a>c>b
                System.out.println(a+" is Greatest");
            } else { //c>a>b
                System.out.println(c+" is Greatest");
            }
        } else {
            if (b > c){ // b>a>c or b>c>a
                System.out.println(b+" is Greatest");
            } else { // c>b>a
                System.out.println(c+" is Greatest");
            }
        }
    }
}
