package com.example.coleodegibis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coleodegibis.controllers.GibiControllerVetor;
import com.example.coleodegibis.entities.Gibi;
import com.example.coleodegibis.interfaces.IGibiController;

public class CadastroGibiActivity extends AppCompatActivity {

    EditText etNomeRevista;
    EditText etTituloRevista;
    EditText etNumeroRevista;
    EditText etEditoraRevista;
    IGibiController gibiController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomeRevista = findViewById(R.id.editTextRevista);
        etTituloRevista = findViewById(R.id.editTextTitulo);
        etNumeroRevista = findViewById(R.id.editTextNumero);
        etEditoraRevista = findViewById(R.id.editTextEditora);
        gibiController = GibiControllerVetor.getInstace();
    }

    public void visualizar(View view){
        Intent intent = new Intent(this, ActivityVisualizar.class);
        intent.putExtra("nome", etNomeRevista.getText().toString());
        intent.putExtra("titulo", etTituloRevista.getText().toString());
        intent.putExtra("numero", etNumeroRevista.getText().toString());
        intent.putExtra("editora", etEditoraRevista.getText().toString());
        Toast.makeText(this, "Revista enviada", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void salvarGibi(View view){
        gibiController.create(obterGibiTela());
    }


    private Gibi obterGibiTela(){
        Gibi gibi = new Gibi();
        gibi.setTitulo(etTituloRevista.getText().toString());
        gibi.setTitulo(etNomeRevista.getText().toString());
        gibi.setTitulo(etNumeroRevista.getText().toString());
        gibi.setTitulo(etEditoraRevista.getText().toString());
        return gibi;
    }

}