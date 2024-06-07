import java.util.List;

public class errorHandling extends Exception {

    public static class InvalidAccountTypeException extends Exception {
        public InvalidAccountTypeException(String message) {
            super(message);
        }
    }

    public static class InvalidAmountException extends Exception {
        public InvalidAmountException(String message) {
            super(message);
        }
    }

    public static class AuthenticationException extends Exception {
        public AuthenticationException(String message) {
            super(message);
        }
    }

    public static void validateAccountType(String accType) throws InvalidAccountTypeException {
        if (!accType.equals("Saving") && !accType.equals("Current")) {
            throw new InvalidAccountTypeException("Invalid account type!!.");
        }
    }

    public static void validateAmount(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount. Please enter a positive value.");
        }
    }
}

   /* public static void validateAuthentication(Account , String pin) throws AuthenticationException {
        if (account == null) {
            throw new AuthenticationException("Invalid account number.");
        }
        if (!account.getPin().equals(pin)) {
            throw new AuthenticationException("Invalid PIN.");
        }
    }

    // Other error handling methods can be added here
}
*/

