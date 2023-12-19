package com.george.Music.app.service;

import com.george.Music.app.resourceclasses.Album;
import com.george.Music.app.resourceclasses.Genre;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumService {

    private static final List<Album> ALBUMS = new ArrayList<>();

    private static int NO_ALBUMS = 8;

    static {

        ALBUMS.add(new Album("Miles Smiles", "Miles Davis", 2504, Genre.JAZZ, 1));
        ALBUMS.add(new Album("My Favorite Things", "John Coltrane", 2425, Genre.JAZZ, 2));
        ALBUMS.add(new Album("Giant Steps", "John Coltrane", 2223, Genre.JAZZ, 3));
        ALBUMS.add(new Album("Thriller", "Michael Jackson", 2310, Genre.POP, 4));
        ALBUMS.add(new Album("24K Magic", "Bruno Mars", 2310, Genre.POP, 5));
        ALBUMS.add(new Album("Lateralus", "Tool", 2310, Genre.ROCK, 6));
        ALBUMS.add(new Album("Deadwing", "Porcupine Tree", 2310, Genre.ROCK, 7));
        ALBUMS.add(new Album("Dirt", "Alice In Chains", 2310, Genre.ROCK, 8));

    }

    public List<Album> getAlbums() {
        return ALBUMS;
    }

    public List<Album> getAlbumsByArtist(String artist) {
        List<Album> albums = ALBUMS.stream()
                .filter(a -> artist.equals(a.getArtist()))
                .toList();
        if (!albums.isEmpty()) {
            return albums;
        } else throw new RuntimeException("No albums by artist");
    }

    public Album getAlbumByArtistAndName(String artist, String name) {
        return ALBUMS.stream()
                .filter(a -> a.getName().equals(name) && a.getArtist().equals(artist))
                .findFirst()
                .orElseThrow();
    }

    public Album getAlbumByName(String name) {
        return ALBUMS.stream()
                .filter(a -> a.getName().equals(name))
                .findFirst()
                .orElseThrow();
    }

    public void deleteAllAlbumsByArtist(String artist) {
        List<Album> delAlbums = ALBUMS.stream()
                .filter(a -> a.getArtist().equals(artist))
                .toList();
        if (!delAlbums.isEmpty()) {
            ALBUMS.removeAll(delAlbums);
        } else throw new RuntimeException("No albums by artist");
    }

    public void deleteAlbumByArtistAndName(String artist, String name) {
        Album album = ALBUMS.stream()
                .filter(a -> a.getName().equals(name) && a.getArtist().equals(artist))
                .findFirst()
                .orElseThrow();
        ALBUMS.remove(album);
    }

    public Album create(Album album) {
        album.setId(NO_ALBUMS++);
        ALBUMS.add(album);

        return album;
    }

    public int getAlbumDurationByArtistAndName(String artist, String name) {
        return ALBUMS.stream()
                .filter(a -> a.getName().equals(name) && a.getArtist().equals(artist))
                .findFirst()
                .orElseThrow()
                .getDuration();
    }

}
