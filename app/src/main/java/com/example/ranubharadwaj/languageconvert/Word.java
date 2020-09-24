package com.example.ranubharadwaj.languageconvert;

import android.widget.ImageView;

/**
 * Created by Ranu Bharadwaj on 16-Jan-18.
 */

public class Word {
    private String mDefaultTranslation;

               /** Miwok translation for the word */
              private String mMiwokTranslation;
private int mImageTranslation =-1;


                public Word(String defaultTranslation, String miwokTranslation, Integer imageTranslation) {
                mDefaultTranslation = defaultTranslation;
               mMiwokTranslation = miwokTranslation;
                   mImageTranslation = imageTranslation;
            }
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }
               /**
          * Get the default translation of the word.
     +     */
                public String getDefaultTranslation() {
                return mDefaultTranslation;
            }

              /**
     +     * Get the Miwok translation of the word.
     +     */
                public String getMiwokTranslation() {
                return mMiwokTranslation;
            }
  public int getImageTranslation(){return mImageTranslation;}
    public boolean hasImage(){
        if(mImageTranslation==-1){
            return false;
        }
        else{
            return true;
        }
    }
}
