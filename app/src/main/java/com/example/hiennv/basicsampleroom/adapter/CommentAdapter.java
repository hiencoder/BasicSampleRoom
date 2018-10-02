package com.example.hiennv.basicsampleroom.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentHolder>{
    @NonNull
    @Override
    public CommentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CommentHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CommentHolder extends RecyclerView.ViewHolder {
        public CommentHolder(View itemView) {
            super(itemView);
        }
    }
}
