package com.example.modelo_parcial_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class ProductoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Bundle bundle = super.getIntent().getExtras();

        String nombre = bundle.getString("nombre", "Nombre default");
        Integer id = bundle.getInt("id", 200);
        int cantidad = bundle.getInt("cantidad", 200);
        int precio = bundle.getInt("precio", 30);

        Log.d("id",id.toString());

        ProductoModel modelo = new ProductoModel(1,nombre, cantidad, precio);
        ProductoController controller = new ProductoController(modelo);
        ProductoView view = new ProductoView(this,modelo, controller);
        controller.setView(view);

        ActionBar acbar = super.getSupportActionBar();
        acbar.setDisplayHomeAsUpEnabled(true);

        view.mostrarModelo();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}