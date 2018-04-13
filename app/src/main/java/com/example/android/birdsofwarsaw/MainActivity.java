package com.example.android.birdsofwarsaw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.birdsofwarsaw.BirdAdapter;
import com.example.android.birdsofwarsaw.BirdDisplayActivity;
import com.example.android.birdsofwarsaw.R;

import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.list) ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // bind butterknife after setContectView(..)
        ButterKnife.bind(this);

        // Create a list of birds
        ArrayList <com.example.android.birdsofwarsaw.Bird> birds = new ArrayList <com.example.android.birdsofwarsaw.Bird>();
        birds.add(new com.example.android.birdsofwarsaw.Bird("mazurek", "parki", R.drawable.mazurek));
        birds.add(new com.example.android.birdsofwarsaw.Bird("wróbel zwyczajny", "kępy krzewów", R.drawable.wrobelzwyczajny));
        birds.add(new com.example.android.birdsofwarsaw.Bird("dzwoniec zwyczajny", "parki i obrzeża lasów", R.drawable.dzwonieczwyczajny));
        birds.add(new com.example.android.birdsofwarsaw.Bird("kos", "parki, ogrody, ale też blisko ludzi", R.drawable.kos));
        birds.add(new com.example.android.birdsofwarsaw.Bird("szpak zwyczajny", "obrzeża lasów, blisko ludzi", R.drawable.szpakzwyczajny));
        birds.add(new com.example.android.birdsofwarsaw.Bird("gołąb miejski", "wszędobylski", R.drawable.golabmiejski));
        birds.add(new com.example.android.birdsofwarsaw.Bird("gołąb grzywacz", "rzadkie lasy liściaste, ostatnio miasta", R.drawable.golabgrzywacz));
        birds.add(new com.example.android.birdsofwarsaw.Bird("sikora bogatka", "parki", R.drawable.sikorabogatka));
        birds.add(new com.example.android.birdsofwarsaw.Bird("jerzyk", "szczeliny murów, dachy, głównie w locie", R.drawable.jerzyk));
        birds.add(new com.example.android.birdsofwarsaw.Bird("sroka zwyczajna", "w pobliżu skupisk ludzkich", R.drawable.srokazwyczajna));
        birds.add(new com.example.android.birdsofwarsaw.Bird("gawron", "w pobliżu skupisk ludzkich", R.drawable.gawron));
        birds.add(new com.example.android.birdsofwarsaw.Bird("kawka", "w pobliżu skupisk ludzkich", R.drawable.kawka));
        birds.add(new com.example.android.birdsofwarsaw.Bird("wrona siwa", "brzegi lasów, miasta", R.drawable.wronasiwa));
        birds.add(new com.example.android.birdsofwarsaw.Bird("kaczka krzyżówka", "stawy, jeziora", R.drawable.kaczkakrzyzowka));
        birds.add(new com.example.android.birdsofwarsaw.Bird("łabędź niemy", "stawy, jeziora, rzeki", R.drawable.labedzniemy));

        // Create an {@link BirdAdapter}, whose data source is a list of {@link Bird}s. The
        // adapter knows how to create list items for each item in the list.
        final BirdAdapter adapter = new BirdAdapter(this, birds);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Tracking which item was selected, starting new activity and passing the array
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                Intent birdIntent = new Intent(MainActivity.this, BirdDisplayActivity.class);
                // get the data from adapter
                com.example.android.birdsofwarsaw.Bird getData = (com.example.android.birdsofwarsaw.Bird) adapter.getItem(position);
                // put the data in intent
                Intent birdSounds = birdIntent.putExtra("birdSounds", getData);
                startActivity(birdSounds);
            }
        });

    }
}
