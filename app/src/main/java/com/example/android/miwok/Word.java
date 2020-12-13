package com.example.android.miwok;

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /**Miwok imageResource id*/

    private  int mImageResourceId=NO_IMAGE_PROVIDED;

    /**Image valid id*/
    private static  final  int NO_IMAGE_PROVIDED=-1;


    /**MediaPlayer Resource id*/
    private  int mAudioResourceId;



    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation ,int mediaPlayerResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = mediaPlayerResource;
    }

    /**
     * Create a new Word object.
     * @param imageResourceId is the drawable resource id associtae with the word
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId,int mediaPlayerResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = mediaPlayerResource;
    }





    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the Miwok ImageResource id.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get whether there is valid image or not.
     */
     public  boolean hasImage(){
         return NO_IMAGE_PROVIDED!=mImageResourceId;
     }

    /**
     * Get whether there is valid image or not.
     */
    public  int getmAudioResourceId(){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
