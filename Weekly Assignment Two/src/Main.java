import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        System.out.println("WELCOME TO OUR BANKING SYSTEM");
        System.out.println("=============================");
        System.out.println("Choose one of the following options: ");
        System.out.println("1. Create a new account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Account Display");
        System.out.println("5. Calculate Interest");
        System.out.println("6. Exit");

        Services services = new Services();
        Scanner scanner = new Scanner(System.in);

        //Loop for taking the input
        while (true) {
            String selectedNumber = scanner.nextLine();
            if (selectedNumber.equals("1")) {
                services.createAcc();
            } else if (selectedNumber.equals("2")) {
                services.deposit();
            } else if (selectedNumber.equals("3")) {
                services.withdraw();
            }else if (selectedNumber.equals("4")){
                services.accDisplay();
            }else if (selectedNumber.equals("5")) {
                services.calculateInterest();
            } else if (selectedNumber.equals("6")) {
                System.out.println("Thank you for using the system");
                break;
            }else
                System.out.println("Invalid Input");
        }
        scanner.close();
    }
}