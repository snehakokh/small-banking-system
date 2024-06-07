import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Services {
    private static List<Account> accounts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createAcc() {
        //name input
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        //type input
        boolean valid = false;
        String accType = null;
        while (!valid) {
            System.out.println("Enter Account Type (Saving or Current)");
            accType = scanner.nextLine();
            //throwing error for invalid accType
            try {
                errorHandling.validateAccountType(accType);
                valid = true; // Exit the loop if the account type is valid
            } catch (errorHandling.InvalidAccountTypeException e) {
                System.out.println(e.getMessage());
            }
            continue;
        }
        //balance input
        System.out.println("Enter balance");
        String balance = scanner.nextLine();

        //pin input
        System.out.println("Set a pin");
        String pin = scanner.nextLine();

        Account account = new Account(name, balance, accType, pin);
        accounts.add(account);
        System.out.println("Account created successfully. Account Number: " + account.getaccNumber());
    }

    public void deposit(){
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        // Find the account with the specified account number
        Account account = findAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter deposit amount: ");
        String amountString = scanner.nextLine();


    }

    private Account findAccountByNumber(String accNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accNumber)) {
                return account;
            }
        }
        return null;
    }

    public void withdraw() {
    }

    public void accDisplay() {
    }

    public void calculateInterest() {
    }
}
