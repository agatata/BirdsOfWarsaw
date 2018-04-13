package com.example.android.birdsofwarsaw;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class BirdAdapter extends ArrayAdapter <Bird> {

    private static final String LOG_TAG = BirdAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param birds   A List of Words objects to display in a list
     */
    public BirdAdapter(Activity context, ArrayList <com.example.android.birdsofwarsaw.Bird> birds) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, birds);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        com.example.android.birdsofwarsaw.Bird currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current Bird object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getBirdName());

        // Find the TextView in the list_item.xml layout with the ID place_text_view
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        // Get the version number from the current Bird object and
        // set this text on the number TextView
        placeTextView.setText(currentWord.getBirdPlace());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Display the provided image based on the resource ID
        imageView.setImageResource(currentWord.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
