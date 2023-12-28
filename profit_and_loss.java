import java.util.Scanner;

public class profit_and_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int cp = sc.nextInt();

        System.out.print("Enter Selling Price: ");
        int sp = sc.nextInt();

        if (sp > cp){
            System.out.println("Profit "+(sp - cp)+" rs");
        } else if (cp > sp) {
            System.out.println("Loss "+(cp - sp)+" rs");
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
