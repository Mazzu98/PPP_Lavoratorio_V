package com.example.modelo_parcial_1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductoVH extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView tvId;
    TextView tvNombre;
    TextView tvCantidad;
    TextView tvPrecio;
    View item;

    public ProductoVH(@NonNull View itemView) {
        super(itemView);
        this.tvId = itemView.findViewById(R.id.tvId);
        this.tvNombre = itemView.findViewById(R.id.tvNombre);
        this.tvCantidad = itemView.findViewById(R.id.tvCantidad);
        this.tvPrecio = itemView.findViewById(R.id.tvPrecio);
        this.item = itemView.findViewById(R.id.producto);
    }

    @Override
    public void onClick(View view) {
        Context context = item.getContext();
        Intent i = new Intent(context,ProductoActivity.class);
        i.putExtra("id",Integer.parseInt(tvId.getText().toString()));
        i.putExtra("nombre",tvNombre.getText().toString());
        i.putExtra("cantidad",Integer.parseInt(tvCantidad.getText().toString()));
        i.putExtra("precio",Integer.parseInt(tvPrecio.getText().toString()));

        context.startActivity(i);
    }
}