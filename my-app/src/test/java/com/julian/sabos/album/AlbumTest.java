package com.julian.sabos.album;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class AlbumTest  {
    @Test
    public void verifyThatAnAlbumWithNoSongsAsZeroLength() {
        // GIVEN
        final Album alb = new Album();
        // WHEN
        final Long result = alb.length();
        // THEN
        assertThat(result).isZero();
    }


    @Test
    public void verifyThatAnAlbumWithSongButNoLengthAsZeroLength() {
        // GIVEN
        final Album alb = new Album();
        final Song song = new Song();
        alb.setSongs(Collections.singletonList(song));
        // WHEN
        final Long result = alb.length();
        // THEN
        assertThat(result).isZero();
    }

    @Test
    public void verifyThatAnAlbumWithASongOfLengthTenAsALengthTen() {
        // GIVEN
        final Album alb = new Album();
        final Song song = new Song();
        song.setLength(10L);
        alb.setSongs(Collections.singletonList(song));
        // WHEN
        final Long result = alb.length();
        // THEN
        assertThat(result).isEqualTo(10L);
    }

    @Test
    public void verifyThatAnAlbumWithSongsCumulatesLenght() {
        // GIVEN
        final Album alb = new Album();
        final Song song1 = new Song();
        song1.setLength(10L);
        final Song song2 = new Song();
        song2.setLength(13L);
        alb.setSongs(Arrays.asList(song1,song2));
        // WHEN
        final Long result = alb.length();
        // THEN
        assertThat(result).isEqualTo(23L);
    }

}
