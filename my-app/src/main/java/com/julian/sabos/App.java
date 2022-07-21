package com.julian.sabos;

import com.julian.sabos.band.Band;
import com.julian.sabos.band.Bassist;
import com.julian.sabos.band.Drummer;
import com.julian.sabos.band.Guitarist;
import com.julian.sabos.band.Singer;
import com.julian.sabos.band.VoiceType;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class App {

    public static final Collection<Band> BANDS = Collections.emptySet();

    public static void main(String[] args) {
        System.out.println("We will be creating band.");
        initBand();
        BANDS.forEach(x -> System.out.println(x.toString()));
    }

    public static void initBand() {

        // ---- Led Zeppelin
        Band band1 = new Band();
        band1.setName("Led Zeppelin");

        Bassist jpj = new Bassist();
        jpj.birth = LocalDate.of(1948, Month.JANUARY, 3);
        jpj.firstName = "John Richard";
        jpj.name = "Baldwin";
        jpj.surname = "John Paul Jones";

        Singer rpl = new Singer();
        rpl.birth = LocalDate.of(1946, Month.AUGUST, 20);
        rpl.firstName = "Robert Anthony";
        rpl.name = "Plant";
        rpl.surname = "Robert Plant";
        rpl.voiceType = VoiceType.BARITONE;

        Guitarist jpa = new Guitarist();
        jpa.birth = LocalDate.of(1944, Month.JANUARY, 9);
        jpa.firstName = "James Patrick";
        rpl.name = "Page";
        jpa.surname = "Jimmy Page";

        Drummer jbo = new Drummer();

        band1.addMusician(jpj);
        band1.addMusician(rpl);
        band1.addMusician(jpa);
        band1.addMusician(jbo);

        jbo.birth = LocalDate.of(1948, Month.MAY, 31);
        jbo.firstName = "John Henry";
        jbo.name = "Bonham";
        jbo.surname = "Bonzo";
        jbo.death = LocalDate.of(1980, Month.SEPTEMBER, 25);


        band1.setActivityStart(LocalDate.of(1968, Month.DECEMBER, 9));
        band1.setActivityEnd(LocalDate.of(1980, Month.FEBRUARY, 12));

        // ---- The Beatles
        Band band2 = new Band();
        band2.setName("The Beatles");

        band2.setActivityStart(LocalDate.of(1968, Month.DECEMBER, 9));
        band2.setActivityEnd(LocalDate.of(1970, Month.FEBRUARY, 12));

        Singer jln = new Singer();
        jln.birth = LocalDate.of(1940, Month.OCTOBER, 9);
        jln.death = LocalDate.of(1980, Month.DECEMBER, 8);
        jln.firstName = "John";
        jln.name = "Winston Ono Lennon";
        jln.surname = "John Lennon";
        jln.voiceType = VoiceType.BASS;

        Singer pmc = new Singer();
        pmc.birth = LocalDate.of(1943, Month.FEBRUARY, 25);
        pmc.death = LocalDate.of(2001, Month.NOVEMBER, 29);
        pmc.firstName = "George";
        pmc.name = "Harrison";
        pmc.surname = "George Harrison";
        pmc.voiceType = VoiceType.CONTRALTO;

        Singer rst = new Singer();
        rst.birth = LocalDate.of(1940, Month.JULY, 7);
        rst.firstName = "Richard";
        rst.name = "Starkey";
        rst.surname = "Ringo Star";

        band2.addMusician(jln);
        band2.addMusician(pmc);
        band2.addMusician(rst);

        BANDS.add(band1);
        BANDS.add(band2);
    }
}
