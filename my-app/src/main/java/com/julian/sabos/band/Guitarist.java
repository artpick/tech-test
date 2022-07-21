package com.julian.sabos.band;

public class Guitarist extends Musician {
    @Override
    public String toString() {
        return "\tGuitarist\n" +
                "\t\t- surname : '" + surname + "'\n" +
                "\t\t- name : '" + name + "'\n" +
                "\t\t- first name : '" + firstName + "'\n" +
                "\t\t- birth : " + birth + "'\n" +
                ((death != null) ? "\t\t- death : " + death + "'\n" : "");
    }
}
