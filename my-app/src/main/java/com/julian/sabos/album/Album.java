package com.julian.sabos.album;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;

public class Album {

    private String title;
    private LocalDateTime releaseDate;
    private List<Song> songs = new ArrayList<>();

    @Override
    public String toString() {
        return "Album\n" +
                "\t- title: '" + title + '\'' +
                "\t- length: " + length() +
                "\t- release date: " + releaseDate + "\n" +
                "\t- songs: " + songs + "\n";
    }

    public Long length() {
        int i = 0;
        Long i2 = 0L;
        while (i < songs.size()) {
            i++;
            Long length = songs.get(i).getLength();
            i2 = i2 + length;
        }
        return i2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Collection<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
