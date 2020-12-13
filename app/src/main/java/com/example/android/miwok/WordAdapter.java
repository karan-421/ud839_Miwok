package com.example.android.miwok;


import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;



public class WordAdapter extends ArrayAdapter<Word> {


    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    private MediaPlayer mediaPlayer;



      public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId)
    {
        super(context,0, words);
        mColorResourceId=colorResourceId;
    }






    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       // return super.getView(position, convertView, parent);
        View listItemView = convertView;


        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord = getItem(position);




        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());



        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);




        if(currentWord.hasImage()) {
            //Make the image visible
            imageView.setImageResource(currentWord.getmImageResourceId());

            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
      int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container View
       textContainer.setBackgroundColor(color);
     //   textContainer.setBackgroundResource(mColorResourceId);

        return listItemView;
    }
}
