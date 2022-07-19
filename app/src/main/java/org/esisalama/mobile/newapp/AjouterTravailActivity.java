package org.esisalama.mobile.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class AjouterTravailActivity extends AppCompatActivity {

    private EditText editTextDescription;
    private EditText editTextPromotion ;
    private EditText editTextCategorie;
    private EditText editTextDateTravail;
    private Button boutonAjouterphoto;
    private Button boutonAjouterTravail;
    private TextView textViewNomsPhotos;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_travail);

        initialiserCompoant();



    }

    private void initialiserCompoant(){

        editTextDescription = findViewById(R.id.editTextDesc);
        editTextPromotion = findViewById(R.id.editTextPromotion);
        editTextCategorie = findViewById(R.id.editTextCat);
        editTextPromotion = findViewById(R.id.editTextPromotion);
        editTextDateTravail = findViewById(R.id.editTextDate);
        boutonAjouterphoto = findViewById(R.id.btnAjouterPhoto);
        textViewNomsPhotos = findViewById(R.id.tvImages);
        boutonAjouterTravail = findViewById(R.id.btnAjouterTravail);
        progressBar = findViewById(R.id.progressBar);





    }


}