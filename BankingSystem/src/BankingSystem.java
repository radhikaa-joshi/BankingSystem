import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accountHolder;
        double balance = 0;
        int choice;

        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        do {
            System.out.println("\n===== Banking System =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposited " + deposit + ". New Balance: " + balance);
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn " + withdraw + ". New Balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                }
                case 3 -> System.out.println("Current Balance: " + balance);
                case 4 -> System.out.println("Exiting... Thank you, " + accountHolder + "!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
