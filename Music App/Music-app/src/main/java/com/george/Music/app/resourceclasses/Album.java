package com.george.Music.app.resourceclasses;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Album {

    @NonNull
    //album name
    private String name;

    @NonNull
    //name of artist
    private String artist;

    //duration in seconds
    private int duration;

    @NonNull
    //enum genre
    private Genre genre;

    private int id;

}
