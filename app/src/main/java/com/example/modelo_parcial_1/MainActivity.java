package com.example.modelo_parcial_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductoModel> productos = new ArrayList<>();

        for(int i = 0; i < 15; i++){
            productos.add(new ProductoModel(i, "Nombre " + i,  i * 3, i * 7));
        }

        AdapterProducto adapterProducto = new AdapterProducto(productos);

        RecyclerView rv = super.findViewById(R.id.rvProductos);
        rv.setAdapter(adapterProducto);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }

}