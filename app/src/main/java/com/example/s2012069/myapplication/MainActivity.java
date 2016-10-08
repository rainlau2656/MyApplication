package com.example.s2012069.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamAScore = 0, TeamBScore = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //--------------------------------------------------------------------------------------
    public void addThreeToTeamA(View view) {
        TeamAScore = TeamAScore + 3;
        displayForTeamA(TeamAScore);
    }

    public void addTwoToTeamA(View view) {
        TeamAScore = TeamAScore + 2;
        displayForTeamA(TeamAScore);
    }

    public void addOneToTeamA(View view) {
        TeamAScore++;
        displayForTeamA(TeamAScore);
    }
    //---------------------------------------------------------------------------------

    public void addThreeToTeamB(View view) {
        TeamBScore = TeamBScore + 3;
        displayForTeamB(TeamBScore);
    }

    public void addTwoToTeamB(View view) {
        TeamBScore = TeamBScore + 2;
        displayForTeamB(TeamBScore);
    }

    public void addOneToTeamB(View view) {
        TeamBScore++;
        displayForTeamB(TeamBScore);
    }
//-------------------------------------------------------------------------------------
public void Reset(View view) {
    TeamAScore=0;
    TeamBScore=0;
    displayForTeamA(TeamAScore);
    displayForTeamB(TeamBScore);
}
//-------------------------------------------------------------------------------------

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }

    public void Reset(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Reset);
        scoreView.setText(String.valueOf(score));
    }
}



