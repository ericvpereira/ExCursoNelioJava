package entities;

import java.time.LocalDate;

public class UsedProduct extends Product{
    private LocalDate ManufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        ManufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return String.format(getName() + " (used) $ " + getPrice() + " (Manufacture Date: " + ManufactureDate.toString() + ")");
    }
}
