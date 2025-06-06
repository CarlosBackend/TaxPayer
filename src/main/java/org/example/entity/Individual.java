package org.example.entity;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(String name, double anuallcome) {
        super(name, anuallcome);
    }

    public Individual(String name, double anuallcome, Double healthExpenditures) {
        super(name, anuallcome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }


    @Override
    public double Tax() {
        double tax = 0.0;
        if(getHealthExpenditures() > 0){
            if (super.getAnuallcome() < 2000.00){
                tax = super.getAnuallcome() * 0.15;
                tax -= getHealthExpenditures() * 0.5;
                return tax;
            }if(super.getAnuallcome() >= 2000.00){
                tax = super.getAnuallcome() * 0.25;
                tax -= getHealthExpenditures() * 0.5;
                return tax;
            }
        }else{
            if (super.getAnuallcome() < 2000.00){
                tax = super.getAnuallcome() * 0.15;
                return tax;
            }else{
                tax = super.getAnuallcome() * 0.25;
                return tax;
            }
        }
        return tax;
    }
}
