package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Courses extends AppCompatActivity implements View.OnClickListener {

    private CardView start, grammar, greet, kanji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        start = findViewById(R.id.cv_getstart);
        grammar = findViewById(R.id.cv_grammar);
        greet = findViewById(R.id.cv_greetings);
        kanji = findViewById(R.id.cv_kanji);

        start.setOnClickListener(this);
        grammar.setOnClickListener(this);
        greet.setOnClickListener(this);
        kanji.setOnClickListener(this);
    }
        @Override
        public void onClick(View v) {
            Intent i;
            switch (v.getId()) {
                case R.id.cv_getstart:
                    i = new Intent(this, Start.class);
                    startActivity(i);
                    break;
                case R.id.cv_grammar:
                    i = new Intent(this, Grammar.class);
                    startActivity(i);
                    break;
                case R.id.cv_greetings:
                    i = new Intent(this, Greetings.class);
                    startActivity(i);
                    break;
                case R.id.cv_kanji:
                    i = new Intent(this, Kanji.class);
                    startActivity(i);
                    break;
                default:
                    break;


            }
        }

    }
