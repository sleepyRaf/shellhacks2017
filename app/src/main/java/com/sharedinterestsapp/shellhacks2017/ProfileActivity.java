package com.sharedinterestsapp.shellhacks2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    public final int GAME_ID = R.drawable.gamepad_variant;
    public final int MUSIC_ID = R.drawable.ic_music_note_white_18dp;
    public final int TVSHOW_ID = R.drawable.television_classic;

    ArrayList<Interest> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        createDummyInterestList();

        TextView usernameView = (TextView) findViewById(R.id.username);
        usernameView.setText("sleepyRaf");

        TextView statusView = (TextView) findViewById(R.id.status);
        statusView.setText("Free for lunch from 2-3pm");

        InterestAdapter adapter = new InterestAdapter(getBaseContext(), mList);

        ListView interestListView = (ListView) findViewById(R.id.interest_list);
        interestListView.setAdapter(adapter);
    }

    private void createDummyInterestList() {
        mList.add(new Interest(MUSIC_ID, "Porter Robinson"));
        mList.add(new Interest(MUSIC_ID, "Madeon"));
        mList.add(new Interest(MUSIC_ID, "Mob"));
        mList.add(new Interest(TVSHOW_ID, "Inuyasha"));
        mList.add(new Interest(GAME_ID, "Super Mario Sunshine"));
        mList.add(new Interest(GAME_ID, "Super Smash Bros"));
    }
}
