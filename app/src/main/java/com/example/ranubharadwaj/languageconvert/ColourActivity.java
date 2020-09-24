package com.example.ranubharadwaj.languageconvert;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        MediaPlayer ring= MediaPlayer.create(ColourActivity.this,R.raw.whip_sound);
        ring.start();
        ArrayList<Word> Wordc = new ArrayList<Word>();
        Wordc.add(new Word("gray", "gris",R.drawable.color_gray));
        Wordc.add(new Word("red", "rojo",R.drawable.color_red));
        Wordc.add(new Word("black", "negro",R.drawable.color_black));

        Wordc.add(new Word("brown", "marrón",R.drawable.color_brown));
        Wordc.add(new Word("green", "verde",R.drawable.color_green));


        Wordc.add(new Word("yellow", "amarilllo",R.drawable.color_mustard_yellow));

        Wordc.add(new Word("white", "blanco",R.drawable.color_white));













        WordAdapter Adapter = new WordAdapter(this,Wordc,R.color.colorColor);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);

    }

}
