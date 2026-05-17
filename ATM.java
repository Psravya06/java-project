import java.util.Scanner;
public class ATM {
    static double balance = 1000; // initial balance

    static void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw(sc.nextDouble());
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
