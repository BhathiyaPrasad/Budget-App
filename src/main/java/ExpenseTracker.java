import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args){
        Scanner.scanner new Scanner(System.in);
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
                scanner.nextline(); // consume newline after over
                    
                    break;
            
                default:
                    break;
            }
            
        }
    }
}
