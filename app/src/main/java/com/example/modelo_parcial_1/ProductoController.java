package com.example.modelo_parcial_1;

import android.view.View;

public class ProductoController implements View.OnClickListener {

    ProductoModel p;
    ProductoView v;

    ProductoController(ProductoModel p){
        this.p = p;
    }

    public void setView(ProductoView v){
        this.v = v;
    }

    @Override
    public void onClick(View view) {
        this.v.cargarModelo();
    }
}
