package com.kodilla.good.patterns.challenges.food2Door;

import java.time.LocalDate;

public class SupplyDto {
    Supply supply;
    LocalDate localDate;
    boolean isOrdered;

    public SupplyDto(Supply supply, LocalDate localDate, boolean isOrdered) {
        this.supply = supply;
        this.localDate = localDate;
        this.isOrdered = isOrdered;
    }
}
