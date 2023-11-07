import java.io.*;
import java.util.ArrayList;

public class ExpensesStorage {
    private static final String FILENAME = "expenses.txt";

    public static void saveExpenses(ArrayList<Expenses> expenses) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Expenses e : expenses) {
                writer.println(e.getDate() + "," + e.getDescription() + "," + e.getAmount());
            }
        } catch (IOException e) {
            System.out.println("Error Saving Expenses: " + e.getMessage());
        }
    }

    public static ArrayList<Expenses> loadExpenses() {
        ArrayList<Expenses> expenses = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                expenses.add(new Expenses(parts[0], parts[1], Double.parseDouble(parts[2])));
            }
        } catch (IOException e) {
            System.out.println("Error loading expenses: " + e.getMessage());

        }
        return expenses;
    }
}
