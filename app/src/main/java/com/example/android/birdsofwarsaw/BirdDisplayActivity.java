package com.example.android.birdsofwarsaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.widget.Toast.LENGTH_LONG;

public class BirdDisplayActivity extends AppCompatActivity {

    @BindView(R.id.name_text_view_dspl)
    TextView name;
    @BindView(R.id.place_text_view_dspl)
    TextView place;
    @BindView(R.id.image_dspl)
    ImageView image;
    @BindView(R.id.back)
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_display);
        // binding butterknife
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


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent backIntent = new Intent(BirdDisplayActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(backIntent);
            }
        });
    }

    @OnClick({R.id.skip_previous, R.id.play, R.id.skip_next})
    public void setViewOnClickEvent(View view) {
        switch (view.getId()) {
            // Show toast message after clicking "skip_previous" ImageView
            case R.id.skip_previous:
                Toast.makeText(BirdDisplayActivity.this, "Skip previous", Toast.LENGTH_SHORT).show();
                // Show toast message after clicking "play" ImageView
            case R.id.play:
                Toast.makeText(BirdDisplayActivity.this, "Play!", Toast.LENGTH_SHORT).show();
                // Show toast message after clicking "skip_next" ImageView
            case R.id.skip_next:
                Toast.makeText(BirdDisplayActivity.this, "Skip next", Toast.LENGTH_SHORT).show();
        }
    }

}
