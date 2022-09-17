package com.example.coleodegibis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.coleodegibis.controllers.GibiControllerVetor;
import com.example.coleodegibis.entities.Gibi;
import com.example.coleodegibis.interfaces.IGibiController;

public class ActivityVisualizar extends AppCompatActivity {

    private ListView listViewGibis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);

        IGibiController gibiController = GibiControllerVetor.getInstace();

        listViewGibis = findViewById(R.id.listViewGibis);

        ArrayAdapter<Gibi> arrayAdapterGibis= new ArrayAdapter<Gibi>(this, android.R.layout.simple_list_item_1, gibiController.read());

        listViewGibis.setAdapter(arrayAdapterGibis);

    }

    public void adicionarGibi(View view){

        Intent intent = new Intent(this, CadastroGibiActivity.class);
        startActivity(intent);

    }




}