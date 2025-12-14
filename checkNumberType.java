import java.util.Scanner;

public class checkNumberType {
    public static void main(StringMethods[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("Number is Positive");
        } else if(num < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Zero");
        }
        
    }
}
