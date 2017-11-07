package com.example.user.favouritegames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2017.
 */

public class FavouriteGamesAdapter extends ArrayAdapter<Game> {

    public FavouriteGamesAdapter(Context context, ArrayList<Game> games) {super(context, 0, games);}

    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.game_item, parent, false);
        }

        Game currentGame = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.rankingTv);

        ranking.setText(Integer.toString(currentGame.getRanking()));

        TextView title = listItemView.findViewById(R.id.titleTv);
        title.setText(currentGame.getTitle());

        TextView year = listItemView.findViewById(R.id.yearTv);
        year.setText(Integer.toString(currentGame.getYear()));

        ImageView picture = listItemView.findViewById(R.id.imageV);
        picture.setImageDrawable(currentGame.getPicture());

        listItemView.setTag(currentGame);

        return listItemView;
    }





}
