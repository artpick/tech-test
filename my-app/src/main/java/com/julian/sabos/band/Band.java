package com.julian.sabos.band;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class Band {

    private String name;
    private LocalDate activityStart;
    private LocalDate activityEnd;
    private Collection<Musician> musicians = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getActivityStart() {
        return activityStart;
    }

    public void setActivityStart(LocalDate activityStart) {
        this.activityStart = activityStart;
    }

    public LocalDate getActivityEnd() {
        return activityEnd;
    }

    public void setActivityEnd(LocalDate activityEnd) {
        this.activityEnd = activityEnd;
    }

    public Collection<Musician> getMusicians() {
        return musicians;
    }

    public void addMusician(Musician musician) {
        musicians.add(musician);
    }

    @Override
    public String toString() {
        return "Band\n" +
                "\t- name: '" + name + '\'' + "\n" +
                "\t- activity started: " + activityStart + "\n" +
                "\t- activity ended: " + activityEnd + "\n" +
                "\t- musicians: \n" + musicians + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Band band = (Band) o;
        return Objects.equals(activityStart, band.activityStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityStart);
    }
}
