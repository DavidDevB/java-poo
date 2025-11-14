package aubonmarche;

import java.time.LocalDate;

public interface Consumable {

    boolean isRipe();
    boolean isExpired(LocalDate dateVerification);
    long daysBeforeExpiration(LocalDate dateVerification);
}
