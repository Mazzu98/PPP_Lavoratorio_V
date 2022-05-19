package com.example.modelo_parcial_1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProducto extends RecyclerView.Adapter<ProductoVH> {
    List<ProductoModel> productos;

    public AdapterProducto(List<ProductoModel> productos){
        this.productos = productos;
    }

    @NonNull
    @Override
    public ProductoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto, parent, false);

        return new ProductoVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoVH holder, int position) {
        holder.tvId.setText(String.valueOf(this.productos.get(position).getId()));
        holder.tvNombre.setText(this.productos.get(position).getNombre());
        holder.tvCantidad.setText(String.valueOf(this.productos.get(position).getCantidad()));
        holder.tvPrecio.setText(String.valueOf(this.productos.get(position).getPrecio()));
        holder.item.setOnClickListener(holder);
    }

    @Override
    public int getItemCount() {
        return this.productos.size();
    }
}
