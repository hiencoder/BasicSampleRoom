package com.example.hiennv.basicsampleroom.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiennv.basicsampleroom.R;
import com.example.hiennv.basicsampleroom.callback.ProductClickListener;
import com.example.hiennv.basicsampleroom.databinding.ProductItemBinding;
import com.example.hiennv.basicsampleroom.model.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {
    private Context context;
    private List<Product> products;
    private ProductClickListener productClickListener;

    public ProductAdapter(Context context, List<Product> products, ProductClickListener productClickListener) {
        this.context = context;
        this.products = products;
        this.productClickListener = productClickListener;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ProductItemBinding productItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.product_item, parent, false);
        return new ProductHolder(productItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        holder.binding.setProduct(products.get(position));
        holder.binding.setCallback(productClickListener);
    }

    @Override
    public int getItemCount() {
        return products == null ? 0 : products.size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder {
        ProductItemBinding binding;

        public ProductHolder(ProductItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
