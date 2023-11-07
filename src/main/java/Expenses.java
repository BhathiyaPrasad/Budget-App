/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bhathiya Prasad
 */
public class Expenses {
    private String date;
    private String description;
    private double amount;

    public Expenses(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double amount() {
        return amount;
    }

    public String toString() {
        return "Expenses(date=" + date + ",description=" + " + description + , amount=" + amount + ")";
    }

}