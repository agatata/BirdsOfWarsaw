package com.example.android.birdsofwarsaw;

import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * BirdsArrayList class stores ArrayList of bird species
 */

public class BirdsArrayList extends ArrayList {

    private ArrayList <Bird> birds;

    private void birdsArrayList() {
        // Create a list of birds
        birds = new ArrayList <>();
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
    }


    public ArrayList getList(ArrayList birdsArrayList) {
        return birds;
    }

}
