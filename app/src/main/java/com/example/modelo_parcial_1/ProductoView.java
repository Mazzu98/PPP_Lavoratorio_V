package com.example.modelo_parcial_1;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ProductoView {

    Activity a;
    ProductoModel p;
    ProductoController c;
    TextView tvId;
    EditText eNombre;
    EditText eCant;
    EditText ePrecio;
    Button btnEditar;

    ProductoView(Activity a, ProductoModel p, ProductoController c){
        this.a = a;
        this.p = p;
        this.c = c;
        if(this.eNombre == null){
            this.tvId = this.a.findViewById(R.id.tvId);
            this.eNombre = this.a.findViewById(R.id.eNombre);
            this.eCant = this.a.findViewById(R.id.eCant);
            this.ePrecio = this.a.findViewById(R.id.ePrecio);
            this.btnEditar = this.a.findViewById(R.id.btnEditar);
            btnEditar.setOnClickListener(c);
        }
    }

    public void cargarModelo(){

        this.p = new ProductoModel(
                Integer.parseInt(this.tvId.getText().toString()),
                this.eNombre.getText().toString(),
                Integer.parseInt(this.eCant.getText().toString()),
                Integer.parseInt(this.ePrecio.getText().toString())
        );


    }

    public void mostrarModelo() {
        this.tvId.setText(this.p.id.toString());
        this.eNombre.setText(this.p.nombre);
        this.eCant.setText(this.p.cantidad.toString());
        this.ePrecio.setText(this.p.precio.toString());
    }
}
