package entities;

public class Individual extends  TaxPayer {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double valor = 0.0;
        if (this.getAnualIncome() < 20000.00) {
            valor = getAnualIncome() * 0.15;
        } else if (this.getAnualIncome() > 20000.00) {
            valor = getAnualIncome() * 0.25;
        }
        if (healthExpenditures != null) {
            valor -= healthExpenditures * 0.50;
        }
        return valor;
    }
}
