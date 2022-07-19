package org.esisalama.mobile.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Nous commennçns par renommer MainActivty en HomePage

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        //creation de la session
        SharedPreferences session = getSharedPreferences("session",0);
        //recuperer un element de la session
        boolean sessionActive = session.getBoolean("session_active",false);
        if(!sessionActive){
            Intent loginIntent = new Intent(this,LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }
        confgurerButonprofil();
        configurerButonAjout();
        configurerButonListetravail();
    }
    private void configurerButonListetravail(){
        Button listetravail = findViewById(R.id.liste);
        listetravail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listIntent = new Intent(HomePageActivity.this ,listeTravailActivity.class);
            }
        });

    }
    private void configurerButonAjout(){
        Button ajout = findViewById(R.id.ajouter);
        ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajoutIntent = new Intent(HomePageActivity.this ,ajouterTravailActivity.class);
            }
        });

    }
    private void confgurerButonprofil(){
        Button profil = findViewById(R.id.liste);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilIntent = new Intent(HomePageActivity.this ,profilTravailActivity.class);
            }
        });

    }
}




}