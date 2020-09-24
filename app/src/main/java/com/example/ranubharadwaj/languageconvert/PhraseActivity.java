package com.example.ranubharadwaj.languageconvert;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        MediaPlayer ring= MediaPlayer.create(PhraseActivity.this,R.raw.whip_sound);
        ring.start();
        ArrayList<Word> Wordp = new ArrayList<Word>();
        Wordp.add(new Word("what is your name?", "cuál es tu nombre?"));
        Wordp.add(new Word("My name is..", "mi nombre es"));
        Wordp.add(new Word("How are you?", "¿cómo estás?"));
        Wordp.add(new Word("I am good.", "soy bueno"));
        Wordp.add(new Word("Congratulations!!", "felicitaciones"));
        Wordp.add(new Word("Well done.", "bien hecho"));
        Wordp.add(new Word("Good night", "buenas noches"));
        Wordp.add(new Word("Good morning", "Buenos días"));
        Wordp.add(new Word("bye",  "adiós"));
        WordAdapter Adapter = new WordAdapter(this,Wordp,R.color.colorPhrase);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }
}
