package com.julian.sabos.band;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public abstract class Artist {

    public String name;
    public String firstName;
    public LocalDate birth;
    public LocalDate death;

    int age() {
        if (death == null) {
            return Period.between(birth, LocalDateTime.now().toLocalDate()).getYears();
        }
        return -1;
    }

}
