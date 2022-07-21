package com.julian.sabos.band;

public class SongWriter extends Artist{
    @Override
    public String toString() {
        return "SongWriter\n" +
                "\t- name : '" + name + "'\n" +
                "\t- first name : '" + firstName + "'\n" +
                "\t- birth : " + birth + "'\n" +
                ((death != null) ? "\t- death : " + death + "'\n" : "");
    }
}
