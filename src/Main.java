import poo.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        while (true) {
            System.out.println("\n=== Miranda's Bank ===");
            System.out.println("1 - Create Account");
            System.out.println("2 - Show Info");
            System.out.println("3 - Deposit");
            System.out.println("4 - Withdraw");
            System.out.println("0 - Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Pix Key: ");
                    String pix = scanner.nextLine();

                    account.createAccount(name, pix);
                    break;

                case 2:
                    System.out.println("Name: " + account.getOwnerName());
                    System.out.println("Account: " + account.getAccountNumber());
                    System.out.println("Pix: " + account.getPixKey());
                    System.out.println("Balance: R$ " + account.getBalance());
                    break;

                case 3:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    System.out.println("Deposit successful!");
                    break;

                case 4:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();

                    if (account.withdraw(withdraw)) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Transaction failed!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}