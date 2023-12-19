package com.george.Music.app.controller;

import com.george.Music.app.resourceclasses.Album;
import com.george.Music.app.service.AlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums")
@Slf4j
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping
    public List<Album> getAlbums() {return albumService.getAlbums();}

    @GetMapping("/albumsBy-{artist}")
    public ResponseEntity<List<Album>> getAlbumsByArtist(@PathVariable("artist") String artist){
        log.info("Getting albums by " + artist);

        return ResponseEntity.ok(albumService.getAlbumsByArtist(artist));
    }

    @GetMapping("/album/{name}")
    public ResponseEntity<Album> getAlbumByName(@PathVariable("name") String name){
        log.info("Getting album with name \"" + name + "\"");

        return ResponseEntity.ok(albumService.getAlbumByName(name));
    }

    @GetMapping("/album/{artist}-{name}")
    public ResponseEntity<Album> getAlbumByArtistAndName(@PathVariable("artist") String artist,
                                                         @PathVariable("name") String name){
        log.info("Getting album with name \"" + name + "\" by " + artist);

        return ResponseEntity.ok(albumService.getAlbumByArtistAndName(artist, name));
    }

    @GetMapping("/album/{artist}-{name}/duration")
    public String getAlbumDurationByArtistAndName(@PathVariable("artist") String artist,
                                                  @PathVariable("name") String name){
        log.info("Getting duration of album \"" + name + "\" by " + artist);

        return "The duration of this album is " + albumService.getAlbumDurationByArtistAndName(artist, name) / 60
                + " minutes, " + albumService.getAlbumDurationByArtistAndName(artist, name) % 60 + " seconds";
    }

    @DeleteMapping("/albumsBy-{artist}")
    public String deleteALlAlbumsByArtist(@PathVariable("artist") String artist){
        log.info("Deleting albums by " + artist);

        albumService.deleteAllAlbumsByArtist(artist);
        return "deleted albums by " + artist;
    }

    @PostMapping("/album")
    public ResponseEntity<Album> create(@RequestBody Album album){
        return new ResponseEntity<>(albumService.create(album), HttpStatus.CREATED);
    }


}
