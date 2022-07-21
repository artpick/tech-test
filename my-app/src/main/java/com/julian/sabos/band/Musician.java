package com.julian.sabos.band;

public class Musician extends Artist {
    public String surname;

    @Override
    public String toString() {
        return "\tMusician\n" +
                "\t\t- surname : '" + surname + "'\n" +
                "\t\t- name : '" + name + "'\n" +
                "\t\t- first name : '" + firstName + "'\n" +
                "\t\t- birth : " + birth + "'\n" +
                ((death != null) ? "\t\t- death : " + death + "'\n" : "");
    }
}
