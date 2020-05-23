package com.example.bmnd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilClient extends AppCompatActivity {

    private ImageView photoClient;
    private TextView tvAdressResult;
    private TextView tvNomResult;
    private TextView tvTelephoneResult;
    private TextView tvAdress;
    private TextView tvEmailResult;
    private TextView tvEmail;
    private TextView tvTelephone;
    private TextView tvNom;
    private Button btModifierDonnes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_client);
        photoClient = findViewById(R.id.photoClient);
        tvAdressResult = findViewById(R.id.tvAdressResult);
        tvNomResult = findViewById(R.id.tvNomResult);
        tvTelephoneResult = findViewById(R.id.tvTelephoneResult);
        tvAdress = findViewById(R.id.tvAdress);
        tvEmailResult = findViewById(R.id.tvEmailResult);
        tvEmail = findViewById(R.id.tvEmail);
        tvTelephone = findViewById(R.id.tvTelephone);
        tvNom = findViewById(R.id.tvNom);
        btModifierDonnes = findViewById(R.id.btModifierDonnes);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onBtModifierDonnesClick(View view) {
        Intent intent = new Intent(this, ModificationProfilClient.class);
        startActivity(intent);
    }
}
