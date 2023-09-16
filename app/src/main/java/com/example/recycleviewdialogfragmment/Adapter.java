package com.example.recycleviewdialogfragmment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public  class Adapter extends RecyclerView.Adapter<Adapter.NewViewHolder> {


    Context context;
    ArrayList<News> news;

    public Adapter(ArrayList<News> news  ) {
        this.news = news;

    }


        @NonNull
        @Override
        public NewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view =
                    LayoutInflater.from(parent.getContext()).inflate(R.
                            layout.news_custom, parent, false);
            return new NewViewHolder(view);

        }

        @Override
        public void onBindViewHolder(@NonNull NewViewHolder holder, int position) {
            News n = news.get(position);
            holder.tv1.setText(n.getTitle());
            holder.tv2.setText(n.getDetails());

        }

        @Override
        public int getItemCount() {
            return news.size();
        }

        class NewViewHolder extends RecyclerView.ViewHolder  {
            TextView tv1 , tv2;

            public NewViewHolder(@NonNull View itemView) {
                super(itemView);
                tv1 = itemView.findViewById(R.id.tv_title);
                tv2 = itemView.findViewById(R.id.tv_details);




            }
        }
    }

