package com.example.recycleviewdialogfragmment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc = findViewById(R.id.rc);







        ArrayList<News> news = new ArrayList<>();
        news.add(new News("OOO", "JHJBHJB"));
        news.add(new News("111", "fhrfvbfbvfjdvbrubvhfv"));
        news.add(new News("222", "vrjv htrv htrv thrv "));
        news.add(new News("333", "vrtvbhtrvbhtrvevubvtubv"));
        news.add(new News("444", "JHJBHJB"));
        news.add(new News("555", "JHJBHJB"));
        news.add(new News("666", "JHJBHJB"));
        news.add(new News("777", "JHJBHJB"));
        news.add(new News("888", "JHJBHJB"));
        news.add(new News("999", "JHJBHJB"));
        news.add(new News("111", "JHJBHJB"));


        Adapter adapter = new Adapter(news  );
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this  );

        rc.setHasFixedSize(true);
        rc.setLayoutManager(lm);
        rc.setAdapter(adapter);
    }
    }
