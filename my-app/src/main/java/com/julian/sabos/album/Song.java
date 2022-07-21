package com.julian.sabos.album;

import com.julian.sabos.band.Musician;
import com.julian.sabos.band.SongWriter;

import java.time.LocalDateTime;
import java.util.Collection;

public class Song {

    private String title;
    private Long length;
    private LocalDateTime releaseDate;
    private Collection<Musician> musicians;
    private SongWriter author;

    @Override
    public String toString() {
        return "Song:\n" +
                "\t- title: '" + title + '\'' +
                "\t- length: " + length +
                "\t- release date: " + releaseDate +
                "\t- musicians: " + musicians +
                "\t- author: " + author;
    }

    private SongWriter author() {
        return author;
    }

    private void author(SongWriter author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Collection<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(Collection<Musician> musicians) {
        this.musicians = musicians;
    }


}
