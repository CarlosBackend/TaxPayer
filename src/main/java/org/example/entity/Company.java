package org.example.entity;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(String name, double anuallcome, int numberOfEmployees) {
        super(name, anuallcome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double Tax() {
        double tax = 0.0;
        if (numberOfEmployees >10) {
            tax = super.getAnuallcome() * 0.14;
        }else{
            tax += super.getAnuallcome() * 0.16;
        }
        return tax;
    }
}
