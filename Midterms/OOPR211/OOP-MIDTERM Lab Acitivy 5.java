import java.util.Scanner;

public class BankingApp {

    // ==========================================
    // 1. ABSTRACT BASE CLASS (Abstraction & Encapsulation)
    // ==========================================
    public static abstract class Account {
        private String accountNumber;
        private double balance;

        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        // Abstract methods to be overridden by subclasses
        public abstract double calculateWithdrawalFee();
        public abstract String getAccountType();

        public boolean deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Error: Deposit amount must be positive.");
                return false;
            }
            this.balance += amount;
            return true;
        }

        public boolean withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Error: Withdrawal amount must be positive.");
                return false;
            }

            double fee = calculateWithdrawalFee();
            double totalDeduction = amount + fee;

            if (totalDeduction > this.balance) {
                System.out.println("Error: Insufficient funds. Total deduction (Amount + Fee) exceeds balance.");
                return false;
            }

            this.balance -= totalDeduction;
            return true;
        }
    }

    // ==========================================
    // 2. SAVINGS ACCOUNT CLASS (Inheritance)
    // ==========================================
    public static class SavingsAccount extends Account {
        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public double calculateWithdrawalFee() {
            return 0.0;
        }

        @Override
        public String getAccountType() {
            return "Savings";
        }
    }

    // ==========================================
    // 3. CHECKING ACCOUNT CLASS (Inheritance)
    // ==========================================
    public static class CheckingAccount extends Account {
        public CheckingAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public double calculateWithdrawalFee() {
            return 10.0;
        }

        @Override
        public String getAccountType() {
            return "Checking";
        }
    }

    // ==========================================
    // 4. MAIN BANKING APPLICATION DRIVER
    // ==========================================
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the OOP Banking System");
        double openingBalance = readNonNegativeBalance(scanner);

        // Instantiate separate accounts with their own copies of the opening balance
        Account savingsAccount = new SavingsAccount("SAV-101", openingBalance);
        Account checkingAccount = new CheckingAccount("CHK-202", openingBalance);

        // Polymorphic reference starts pointing to the Savings Account object
        Account selectedAccount = savingsAccount;

        boolean running = true;
        while (running) {
            printAccountSummary(selectedAccount);
            showMenu();
            
            System.out.print("Choice: ");
            String input = scanner.nextLine().trim();
            System.out.println(); // Formatter spacer
            
            switch (input) {
                case "1": // Withdraw
                    double withdrawAmount = readPositiveAmount(scanner, "withdraw");
                    if (withdrawAmount > 0) {
                        double fee = selectedAccount.calculateWithdrawalFee();
                        if (selectedAccount.withdraw(withdrawAmount)) {
                            System.out.printf("Withdrawal fee: ₱%.2f | New %s balance: ₱%.2f\n", 
                                    fee, selectedAccount.getAccountType(), selectedAccount.getBalance());
                        }
                    }
                    break;
                    
                case "2": // Deposit
                    double depositAmount = readPositiveAmount(scanner, "deposit");
                    if (depositAmount > 0) {
                        if (selectedAccount.deposit(depositAmount)) {
                            System.out.printf("New %s balance: ₱%.2f\n", 
                                    selectedAccount.getAccountType(), selectedAccount.getBalance());
                        }
                    }
                    break;
                    
                case "3": // Show balance
                    System.out.printf("Current %s Balance: ₱%.2f\n", 
                            selectedAccount.getAccountType(), selectedAccount.getBalance());
                    break;
                    
                case "4": // Switch account (Demonstrating Polymorphism)
                    if (selectedAccount == savingsAccount) {
                        selectedAccount = checkingAccount;
                    } else {
                        selectedAccount = savingsAccount;
                    }
                    System.out.printf("Switched! Current account: %s\n", selectedAccount.getAccountType());
                    break;
                    
                case "5": // Exit
                    System.out.println("Thank you for using the system!");
                    running = false;
                    break;
                    
                default:
                    System.out.println("Error: Invalid choice. Please pick between 1 and 5.");
                    break;
            }
            System.out.println(); // Formatter spacer
        }
        scanner.close();
    }

    // ==========================================
    // 5. HELPER METHODS FOR MENU AND VALIDATION
    // ==========================================
    private static void showMenu() {
        System.out.println("1 Withdraw\n2 Deposit\n3 Show balance\n4 Switch account\n5 Exit");
    }

    private static double readNonNegativeBalance(Scanner scanner) {
        while (true) {
            System.out.print("Opening balance: ");
            try {
                double val = Double.parseDouble(scanner.nextLine());
                if (val >= 0) return val;
                System.out.println("Error: Opening balance cannot be negative.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input format. Please enter a valid number.");
            }
        }
    }

    private static double readPositiveAmount(Scanner scanner, String actionType) {
        while (true) {
            System.out.print("Amount to " + actionType + ": ");
            try {
                double val = Double.parseDouble(scanner.nextLine());
                if (val > 0) return val;
                System.out.println("Error: Amount must be greater than zero.");
                return -1; 
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid numeric input.");
                return -1;
            }
        }
    }

    private static void printAccountSummary(Account account) {
        System.out.printf("Current account: %s | Balance: ₱%.2f\n", 
                account.getAccountType(), account.getBalance());
    }
}