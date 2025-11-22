package entities;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double valor = 0.0;
        if (this.numberOfEmployees > 10) {
            valor = getAnualIncome() * 0.14;
        } else {
            valor = getAnualIncome() * 0.16;
        }

        return valor;
    }
}
