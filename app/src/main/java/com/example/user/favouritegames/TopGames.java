package com.example.user.favouritegames;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2017.
 */

public class TopGames {

    private ArrayList<Game> list;
    private Drawable picture;

    public TopGames(){
        picture = R.drawable.tombRaider;

        list = new ArrayList<>();
        list.add(new Game(1, "Tomb Raider", 1992, picture));
        list.add(new Game(2, "Dark Souls", 2001, picture));
        list.add(new Game(3, "Rocket League" , 2015, picture));
        list.add(new Game(4, "Fifa 17" , 2016, picture));
        list.add(new Game(5, "Chariot" , 2007, picture));
        list.add(new Game(6, "Papers Please" , 1993, picture));
        list.add(new Game(7, "Life Is Strange" , 2014, picture));
        list.add(new Game(8, "For Honor" , 2016, picture));
        list.add(new Game(9, "Alien Isolation" , 2015, picture));
        list.add(new Game(10, "Streets of Rage" , 1992, picture));
    }

    public ArrayList<Game> getList() {
        return list;
    }
}
