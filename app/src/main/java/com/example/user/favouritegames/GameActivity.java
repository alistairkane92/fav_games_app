package com.example.user.favouritegames;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView ranking;
    private TextView title;
    private TextView year;
    private ImageView imageV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ranking = (TextView) findViewById(R.id.rankingTv);
        title = (TextView) findViewById(R.id.titleTv);
        year = (TextView) findViewById(R.id.yearTv);
        imageV = (ImageView) findViewById(R.id.imageV);



        Intent i = getIntent();
        Bundle extras = i.getExtras();

        String rankingString = extras.getString("ranking");
        String titleString = extras.getString("title");
        String yearString = extras.getString("year");
        String gamePicture = extras.getString("picture");

        title.setText(titleString);
        ranking.setText(rankingString);
        year.setText(yearString);
        imageV.setTag(gamePicture);
    }

}
