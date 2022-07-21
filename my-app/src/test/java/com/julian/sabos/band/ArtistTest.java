package com.julian.sabos.band;


import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtistTest  {

    @Test
    public void verifyThatAgeIsNullWhenNoBirthAndDeath(){
        // GIVEN
        final Artist art =  new Artist(){};

        // WHEN
        final int age = art.age();

        // THEN
        assertThat(age).isNull();
    }


    @Test
    public void verifyThatAgeIsNotNullWhenBirthAndDeath(){
        // GIVEN
        final Artist art =  new Artist(){};
        art.birth = LocalDate.MIN;
        art.death = LocalDate.MAX;

        // WHEN
        final int age = art.age();

        // THEN
        assertThat(age).isNotNull();
    }


    @Test
    public void verifyThatAgeIsCorrectWhenBirthAndDeathAreSetProperlyDefaultTestCase(){
        // GIVEN
        final Artist art =  new Artist(){};
        art.birth = LocalDate.now().minusYears(1L);

        // WHEN
        final int age = art.age();

        // THEN
        assertThat(age).isEqualTo(1);
    }

    @Test
    public void verifyThatAgeIsCorrectWhenBirthAndDeathAreSetProperlyButArtistIsDead(){
        // GIVEN
        final Artist art =  new Artist(){};
        art.birth = LocalDate.now().minusYears(5L);
        art.death = LocalDate.now().minusYears(1L);

        // WHEN
        final int age = art.age();

        // THEN
        assertThat(age).isNotNull().isEqualTo(1);
    }
}
