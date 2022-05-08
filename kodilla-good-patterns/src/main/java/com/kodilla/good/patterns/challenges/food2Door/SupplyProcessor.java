package com.kodilla.good.patterns.challenges.food2Door;

import java.time.LocalDate;

public class SupplyProcessor {

    public SupplyDto process(Supply supply, LocalDate localDate, boolean isOrdered) {

        SupplyDto supplyDto = null;

        if (isOrdered) {
            supplyDto = new SupplyDto(supply, localDate, isOrdered);
        } else {
            System.out.print("given supply is not processed");
        }

        return supplyDto;
    }
}
