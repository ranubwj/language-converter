package com.example.ranubharadwaj.languageconvert;

import android.app.Activity;
import android.content.Context;
import android.provider.UserDictionary;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ranu Bharadwaj on 17-Jan-18.
 */

public class WordAdapter extends ArrayAdapter <Word>{
private int mColourResource;

    TextView nameTextView;
    WordAdapter  currentWord;

    public WordAdapter(Activity context, ArrayList<Word> Words,int colourResource) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Words);
        mColourResource=colourResource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView spanishTextView = (TextView) listItemView.findViewById(R.id.spanishText);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        spanishTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.englishText);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        englishTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageTextView = (ImageView) listItemView.findViewById(R.id.imageView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        if(currentWord.hasImage()) {
            imageTextView.setImageResource(currentWord.getImageTranslation());
imageTextView.setVisibility(View.VISIBLE);
        }
        else{
            imageTextView.setVisibility(View.GONE);
        }
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        View textContainer = listItemView.findViewById(R.id.textContentList);
        int collor= ContextCompat.getColor(getContext(),mColourResource);
        textContainer.setBackgroundColor(collor);

        return listItemView;



    }


   /* @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        WordAdapter currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentWord.getDefaultTranslation());


        return listItemView;

    }

    p*/
}
