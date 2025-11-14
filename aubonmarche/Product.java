package aubonmarche;

import java.time.LocalDate;

public abstract class Product implements Consumable {

    private String name;
    private double unitPrice;
    private String unit;
    private double stockQuantity;
    private LocalDate pickingDate;
    private int shelfLifeDays;

    public Product(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.unit = unit;
        this.stockQuantity = stockQuantity;
        this.pickingDate = pickingDate;
        this.shelfLifeDays = shelfLifeDays;
    }

    public abstract LocalDate calculateExpirationDate();


    // Retourne le stock moins la quantité fournie si la quantité est inférieure ou égale au stock.
    public void setStockQuantity(double quantity) {
        if (quantity > this.stockQuantity) {
            System.out.println("Error: Cannot set stock quantity to a value greater than current stock.");
            return;
        }
        this.stockQuantity -= quantity;
    }

    public LocalDate getPickingDate() {
        return pickingDate;
    }

    public int getShelfDays() {
        return shelfLifeDays;
    }


    // Retourne un booléen selon si la date fourni est après la date d'expiration.
    @Override
    public boolean isExpired(LocalDate dateVerification) {
        return dateVerification.isAfter(calculateExpirationDate());
    }
}
