public class Account {
        private static int accCounter = 1000;
        private String name;
        private String accNumber;
        private String accType;
        private String balance;
        private String pin;
        public Account(String name, String balance, String accType, String pin) {
                this.name = name;
                this.balance = balance;
                this.accType = accType;
                this.pin = pin;
                this.accNumber = generateAccountNumber();
        }

        private synchronized String generateAccountNumber() {
                return String.valueOf(accountCounter++);
        }

        public String getAccountNumber() {
                return accountNumber;
        }

        public void deposit(String amount) {
                this.balance = String.valueOf(Long.parseLong(balance) + Long.parseLong(amount));
        }

        public boolean withdraw(String amount) {
                long currentBalance = Long.parseLong(balance);
                long withdrawalAmount = Long.parseLong(amount);
                if (withdrawalAmount > currentBalance) {
                        return false;
                }
                this.balance = String.valueOf(currentBalance - withdrawalAmount);
                return true;
        }

        public String getBalance() {
                return balance;
        }

        public String getPin() {
                return pin;
        }

        public void displayAccountInfo() {
                System.out.println("Account Holder: " + name);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Account Type: " + accountType);
                System.out.println("Balance: " + balance);
        }

        public void calculateInterest() {
                // Assuming a simple interest calculation
                double interestRate = 0.03; // 3% interest rate
                long currentBalance = Long.parseLong(balance);
                long interest = (long)(currentBalance * interestRate);
                System.out.println("Monthly Interest: " + interest);
                this.balance = String.valueOf(currentBalance + interest);
        }
}

}


