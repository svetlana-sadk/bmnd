package com.example.bmnd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ModificationProfilClient extends AppCompatActivity {

    private Button btSauvegarder;
    private ImageView photoClientToEdit;
    private TextView tvNom;
    private EditText editTextEmail;
    private TextView tvEmail;
    private TextView tvAdress;
    private TextView tvTelephone;
    private ImageView imageView2;
    private EditText editTextTelephone;
    private EditText editTextNom;
    private EditText editTextAdress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modification_profil_client);
        btSauvegarder = findViewById(R.id.btSauvegarder);
        photoClientToEdit = findViewById(R.id.photoClientToEdit);
        tvNom = findViewById(R.id.tvNom);
        editTextEmail = findViewById(R.id.editTextEmail);
        tvEmail = findViewById(R.id.tvEmail);
        tvAdress = findViewById(R.id.tvAdress);
        tvTelephone = findViewById(R.id.tvTelephone);
        imageView2 = findViewById(R.id.photoClientToEdit);
        editTextTelephone = findViewById(R.id.editTextTelephone);
        editTextNom = findViewById(R.id.editTextNom);
        editTextAdress = findViewById(R.id.editTextAdress);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onBtSauvegarderClick(View view) {
        // changes in Bean, save, then open them on client page
        Intent intent = new Intent(this, ProfilClient.class);
        startActivity(intent);
    }
}
