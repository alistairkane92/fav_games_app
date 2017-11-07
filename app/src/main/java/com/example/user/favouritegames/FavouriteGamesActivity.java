package com.example.user.favouritegames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FavouriteGamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_games);

        TopGames topGames = new TopGames();
        ArrayList<Game> gameList = topGames.getList();
        FavouriteGamesAdapter gamesAdapter = new FavouriteGamesAdapter(this, gameList);
        ListView listView = (ListView)findViewById(R.id.game_list);
        listView.setAdapter(gamesAdapter);
    }

    public void getGames(View listItem){
        Game game = (Game) listItem.getTag();
        Intent i = new Intent (this, GameActivity.class);
        i.putExtra("title", game.getTitle());
        i.putExtra("ranking", Integer.toString(game.getRanking()));
        i.putExtra("year", Integer.toString(game.getYear()));
        startActivity(i);
    }

}
