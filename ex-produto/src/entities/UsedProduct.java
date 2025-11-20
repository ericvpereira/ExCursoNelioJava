package entities;

import java.time.LocalDateTime;
import java.util.Date;

public class UsedProduct extends Product{
    private Date ManufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        ManufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return String.format(getName() + " (used) $ " + getPrice() + "Manufacture Date: " + ManufactureDate.toString());

    }
}
