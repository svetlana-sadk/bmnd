package com.example.bmnd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private ProgressBar mPb;
    private Button mBtnInscription;
    private Button mBtnConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPb = findViewById(R.id.pb);
        mBtnInscription = findViewById(R.id.btnInscrire);
        mBtnConnect = findViewById(R.id.btnConnect);
    }

    public void onClick(View view) {
        if(view == mBtnConnect) {
            Intent connectIntent = new Intent(this, ConnexionActivity.class );
            startActivity(connectIntent);
        }
        else if (view == mBtnInscription)
        {
            Intent firstConnectIntent = new Intent(this, FirstConnexionActivity.class );
            startActivity(firstConnectIntent);
        }
    }
}
