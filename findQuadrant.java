import java.util.Scanner;

public class findQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x Coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y Coordinate: ");
        int y = sc.nextInt();

        if (x == 0){
            if (y == 0){
                System.out.println("Lies on Origin (0,0)");
            } else if (y > 0) {
                System.out.println("Lies on Positive Y-AXIS");
            } else {
                System.out.println("Lies on Negative Y-AXIS");
            }
        } else if (x > 0){
            if (y == 0){
                System.out.println("Lies on Positive X-AXIS");
            } else if (y > 0) {
                System.out.println("Lies on 1st Quadrant");
            } else {
                System.out.println("Lies on 4th Quadrant");
            }
        } else {
            if (y == 0){
                System.out.println("Lies on Negative X-AXIS");
            } else if (y > 0) {
                System.out.println("Lies on 2nd Quadrant");
            } else {
                System.out.println("Lies on 3rd Quadrant");
            }
        }
    }
}
