package com.example.ranubharadwaj.languageconvert;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        MediaPlayer ring= MediaPlayer.create(FamilyActivity.this,R.raw.whip_sound);
        ring.start();
        ArrayList<Word> Wordf = new ArrayList<Word>();
        Wordf.add(new Word("father", "padre", R.drawable.family_father));
        Wordf.add(new Word("mother", "madre",R.drawable.family_mother));
        Wordf.add(new Word("brother", "hermano",R.drawable.family_older_brother));
        Wordf.add(new Word("sister", "hermana",R.drawable.family_younger_sister));
        Wordf.add(new Word("son", "hijo",R.drawable.family_son));
        Wordf.add(new Word("daughter", "hija",R.drawable.family_daughter));
        Wordf.add(new Word("grandfather", "abuelo",R.drawable.family_grandfather));
        Wordf.add(new Word("grandmother", "abuela",R.drawable.family_grandmother));
        WordAdapter Adapter = new WordAdapter(this,Wordf,R.color.colorFamily);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }
}
