package com.example.hiennv.basicsampleroom.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder>{
    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ProductHolder extends RecyclerView.ViewHolder {
        public ProductHolder(View itemView) {
            super(itemView);
        }
    }
}
