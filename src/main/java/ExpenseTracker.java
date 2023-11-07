import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Expenses> expenses = ExpensesStorage.loadExpenses();

        while (true) {
            System.out.println("\nExpense Tracker Menu");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expense");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter date (YYYY-MM-DD):");
                    String date = scanner.next();
                    scanner.nextLine(); // consume newline after over
                    System.out.println("Enter description: ");
                    String desc = scanner.nextLine();
                    System.out.print("enter Amount:");
                    double amount = scanner.nextDouble();
                    expenses.add(new Expenses(date, desc, amount));
                    ExpensesStorage.saveExpenses(expenses);

                    break;
                case 2:
                    for (Expenses e : expenses) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("GoodBye");
                    return;
                default:
                    System.out.println("invalid choice. Please Select From the Menu");
 scanner.close();
            }

        }
    }
}
