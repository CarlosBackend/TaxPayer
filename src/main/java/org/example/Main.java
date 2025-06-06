package org.example;
import org.example.entity.Company;
import org.example.entity.Individual;
import org.example.entity.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<TaxPayer>();
        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();
        String name = "";
        double anuallcome = 0.0;
        for (int i = 1; i <=n; i++) {
            System.out.println("Tax payer #" + i + ": ");
            System.out.println("Individual or company (i/c) ?");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case 'i':
                    System.out.println("Name:");
                    name = sc.next();
                    System.out.println("Anuallcome:");
                    anuallcome = sc.nextDouble();
                    System.out.println("Health expenditures:");
                    double healthExpenditures = sc.nextDouble();
                    taxPayers.add(new Individual(name, anuallcome, healthExpenditures));
                    break;
                case 'c':
                    System.out.println("Name: ");
                    name = sc.next();
                    System.out.println("Anuallcome:");
                    anuallcome = sc.nextDouble();
                    System.out.println("Number of employees: ");
                    int employees = sc.nextInt();
                    taxPayers.add(new Company(name, anuallcome, employees));
                    break;
               default:
                    System.out.println("Invalid input");
                    return;
            }
        }
        System.out.println("Taxes Paid: ");
        double totalTaxes = 0.0;
       for (TaxPayer t : taxPayers) {
           System.out.println(t.getName() + " $ " + t.Tax());
           totalTaxes += t.Tax();
       }
        System.out.printf("Total Taxes: $ " +"%.2f",totalTaxes);
    }
}