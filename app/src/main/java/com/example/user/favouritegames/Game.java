package com.example.user.favouritegames;

import android.graphics.drawable.Drawable;

/**
 * Created by user on 07/11/2017.
 */

public class Game {

    private int ranking;
    private String title;
    private int year;
    private Drawable picture;

    public Game(int ranking, String title, int year, Drawable picture) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
        this.picture = picture;
    }

    public int getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Drawable getPicture() {
        return picture;
    }
}
