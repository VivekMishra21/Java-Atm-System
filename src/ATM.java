import java.util.Scanner;

class ATM {

    Scanner scanner = new Scanner(System.in);
    double balance;
    int myPin = 1996;

    public void checkPin() {
        System.out.println("Enter your PIN:");
        int pin = scanner.nextInt();

        if (pin != myPin) {
            System.out.println("Invalid PIN. Please enter a valid PIN.");
        } else {
            showMenu();
        }
    }

    public void showMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");

        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("Current Balance: ₹" + balance);
                showMenu();
            }
            case 2 -> {
                System.out.println("Enter amount to withdraw:");
                int amount = scanner.nextInt();

                if (balance < amount) {
                    System.out.println("Insufficient balance.");
                } else {
                    balance -= amount;
                    System.out.println("₹" + amount + " withdrawn successfully.");
                    System.out.println("Updated Balance: ₹" + balance);
                }
                showMenu();
            }
            case 3 -> {
                System.out.println("Enter amount to deposit:");
                int deposit = scanner.nextInt();
                balance += deposit;
                System.out.println("₹" + deposit + " deposited successfully.");
                System.out.println("Updated Balance: ₹" + balance);
                showMenu();
            }
            default -> {
                System.out.println("Invalid option. Please try again.");
                showMenu();
            }
        }
    }
}
