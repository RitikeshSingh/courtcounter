package com.example.android.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int s=0,n=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3(View view) {
        s=s+3;
        displayForTeamA(s);
    }
    public void add2(View view) {
        s=s+2;
        displayForTeamA(s);
    }
    public void add0(View view) {
        s=s+1;
        displayForTeamA(s);
    }



    public void add3n(View view) {
        n=n+3;
        displayForTeamB(n);

    }
    public void add2n(View view) {
        n=n+2;
        displayForTeamB(n);

    }
    public void add0n(View view) {
        n=n+1;
        displayForTeamB(n);

    }
    public void reset(View view) {
        s=0;
        displayForTeamA(s);
        n=0;
        displayForTeamB(n);

    }



}

