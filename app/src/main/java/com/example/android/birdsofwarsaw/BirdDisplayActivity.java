package com.example.android.birdsofwarsaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.widget.Toast.LENGTH_LONG;

public class BirdDisplayActivity extends AppCompatActivity {

    @BindView(R.id.name_text_view_dspl) TextView name;
    @BindView(R.id.place_text_view_dspl) TextView place;
    @BindView(R.id.image_dspl) ImageView image;
    @BindView(R.id.back) ImageView back;
    @BindView(R.id.skip_previous) TextView previous;
    //@BindView(R.id.play) TextView play;
    //@BindView(R.id.skip_next) ImageView next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_display);
        // bind butterknife after setContectView(..)
        ButterKnife.bind(this);

        // get the intent from MainActivity
        Intent birdIntent = getIntent();
        com.example.android.birdsofwarsaw.Bird birdChoice = birdIntent.getParcelableExtra("birdSounds");

        // initialize the strings and the image view ID
        String birdName = birdChoice.getBirdName();
        String birdPlace = birdChoice.getBirdPlace();
        int birdImage = birdChoice.getImageResourceId();

        // set dat to the views
        name.setText(birdName);
        place.setText(birdPlace);
        image.setImageResource(birdImage);



    //   // Set a click listener on that View
    //   previous.setOnClickListener(new View.OnClickListener(int position) {
    //       // The code in this method will be executed when the phrases category is clicked on.
    //       @Override
    //       public void onClick(View view) {
    //           com.example.android.birdsofwarsaw.Bird getData = (com.example.android.birdsofwarsaw.Bird) adapter.getItem(position);
    //           int previousBirdChoce = birdChoice - 1;
    //
    //       }
    //   });


        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent backIntent = new Intent(BirdDisplayActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(backIntent);
            }
        });
    }

}
