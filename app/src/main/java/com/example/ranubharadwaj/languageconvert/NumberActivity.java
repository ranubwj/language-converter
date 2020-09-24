package com.example.ranubharadwaj.languageconvert;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {
    LinearLayout numberView;
    ArrayAdapter itemsAdapter;
    ArrayList spanwords;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        MediaPlayer ring= MediaPlayer.create(NumberActivity.this,R.raw.whip_sound);
        ring.start();

        ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("one", "uno",R.drawable.number_one));
        Words.add(new Word("two", "dos",R.drawable.number_two));
        Words.add(new Word("three", "tres",R.drawable.number_three));
        Words.add(new Word("four", "las cuatro",R.drawable.number_four));
        Words.add(new Word("five", "cinco",R.drawable.number_five));
        Words.add(new Word("six", "seis",R.drawable.number_six));
        Words.add(new Word("seven", "sietc",R.drawable.number_seven));
        Words.add(new Word("eight", "ocho",R.drawable.number_eight));
        Words.add(new Word("nine", "nueve",R.drawable.number_nine));
        Words.add(new Word("ten", "diez",R.drawable.number_ten));










        WordAdapter Adapter = new WordAdapter(this,Words,R.color.colorNumber);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);


       /* int i=0;
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        while(i<10) {

            TextView wordView = new TextView(this);

            wordView.setText(Words.get(i));
            rootView.addView(wordView);
            i++;
        }*/




    }
}
