package aubonmarche;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fruit extends Product {

    public Fruit(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays) {
        super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
    }

    // Retourne la date d'expiration en fonction de 
    // la date de cueillette + le nombre de jours de conservation
    @Override
    public LocalDate calculateExpirationDate() {
        return getPickingDate().plusDays(getShelfDays());
    }


    // Retourne un booléen en fonction si le produit est mûr ou non. 
    // Si la date d'aujourd'hui est avant la date de matûrité alors le produit n'est pas mûr.
    @Override
    public boolean isRipe() {
        LocalDate today = LocalDate.now();
        LocalDate ripenessDate = getPickingDate().plusDays(getShelfDays() / 2);
        return !today.isBefore(ripenessDate);
    }


    // Retourne la différence de jours entre la date fournie et la date d'expiration.
    @Override
    public long daysBeforeExpiration(LocalDate dateVerification) {
        LocalDate expirationDate = calculateExpirationDate();
        return ChronoUnit.DAYS.between(dateVerification, expirationDate);
    }

}
