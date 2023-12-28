import java.util.Scanner;

public class marksStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int marks = sc.nextInt();
        
        if (marks > 80 && marks <= 100){
            System.out.println("Very Good");
        } else if (marks > 60 && marks <= 80) {
            System.out.println("Good");
        } else if (marks > 40 && marks <= 60){
            System.out.println("Average");
        } else {
            System.out.println("Fail");
        }
    }
}
