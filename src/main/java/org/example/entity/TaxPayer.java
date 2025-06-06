package org.example.entity;

public abstract class TaxPayer {
    private String name;
    private double anuallcome;

    public TaxPayer(String name, double anuallcome) {
        this.name = name;
        this.anuallcome = anuallcome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnuallcome() {
        return anuallcome;
    }

    public void setAnuallcome(double anuallcome) {
        this.anuallcome = anuallcome;
    }

    public abstract double Tax();
}
