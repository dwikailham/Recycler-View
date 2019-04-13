package com.dwikailham.jobsheet3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.ViewHolder>{

    private  Context context;
    private LayoutInflater inflater;
    private List<String> mWordlist;

    public WordListAdapter(Context context, List<String> wordList){
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.mWordlist = wordList;
    }

    @NonNull
    @Override
    public WordListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_word, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.ViewHolder viewHolder, int i) {
        String mCurrent = mWordlist.get(i);
        viewHolder.titleText.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView titleText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.word_title);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "test", Toast.LENGTH_SHORT).show();
        }
    }
}


