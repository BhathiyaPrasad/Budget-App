import java.io.*;
import java.util.ArrayList;

public class ExpenseStorage {
    private static final String FILENAME = "expenses.txt";

    public static void saveExpenses(ArrayList<Expenses>expenses) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))){
        for (Expense e : expense){
            writer.println(e.getDate() + "," + e.getDescription() + "," + e.getAmount());
        }}
    catch (IOException e){
         System.out.println("Error Saving Expenses: " + e.getMessage());
    }
    }
    public static ArrayList<Expense> loadExpenses() {
        ArrayList<Expense> expenses = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILENAME))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = Line.split(",");
                expenses.add (New Expenses(parts[0],parts[1],double.parseDoublle(parts[2])));
            }
        }
    }
}