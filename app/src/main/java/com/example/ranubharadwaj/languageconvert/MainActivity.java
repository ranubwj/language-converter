package com.example.ranubharadwaj.languageconvert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Intent i, j , k , l;
  View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumberList(View view){

        Intent i = new Intent(this, NumberActivity.class);
              startActivity(i);
    }
 /*   TextView phrases = (TextView) findViewById(R.id.bPhrase);
   phrases.setOnClickListener(new View.OnClickListener(){
       @Override
               public void onClick(View view{
            Intent k = new Intent(this,  ColourSActivity.class);
            startActivity(k);
        }
    });*/

    public void openPhraseList(View view){

        Intent i = new Intent(this, PhraseActivity.class);
        startActivity(i);
    }
    public void openColourList(View view){

        Intent k = new Intent(this,  ColourActivity.class);
        startActivity(k);
    }
    public void openFamilyList(View view){

        Intent j = new Intent(this, FamilyActivity.class);
        startActivity(j);
    }
}
