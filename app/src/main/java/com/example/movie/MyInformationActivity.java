package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_information);

        Button goto_movie_btn = findViewById(R.id.movie_btn);
        goto_movie_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyInformationActivity.this, MovieChoiceActivity.class);
                startActivity(intent);

            }
        });

        Button goto_my_btn = findViewById(R.id.my_btn);
        goto_my_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //새로고침
                Intent intent = new Intent(MyInformationActivity.this, MyInformationActivity.class);
                finish();
                startActivity(getIntent());
            }
        });

        Button goto_home_btn = findViewById(R.id.home_btn);
        goto_home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyInformationActivity.this, HomeActivity.class);
                startActivity(intent);
                /*intent.putExtra("name", "mike");
                setResult(RESULT_OK, intent);
                finish();*/
            }
        });


        /*Button Btn2 = findViewById(R.id.movie_btn);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyInformationActivity.this, MovieChoiceActivity.class);
                startActivity(intent);

            }
        });*/


        TextView Tv = findViewById(R.id.movname);
        Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyInformationActivity.this, MovieDetailedScreenActivity.class);
                startActivity(intent);
                /*intent.putExtra("name", "mike");
                setResult(RESULT_OK, intent);
                finish();*/
            }
        });
    }
}
