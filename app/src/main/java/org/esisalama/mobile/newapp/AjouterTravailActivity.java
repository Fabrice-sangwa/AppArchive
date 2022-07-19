package org.esisalama.mobile.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class AjouterTravailActivity extends AppCompatActivity {


    private EditText editTextDescription;
    private EditText editTextPromotion;
    private EditText editTextCategory;
    private EditText editTextDateTravail;
    private Button buttonAjouterPhoto;
    private Button buttonAjouterTravail;
    private ProgressBar progressBar;
    private TextView tvNomsPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_travail);
        initialiserComposant();
        verificationConfirmation();
    }

    private void initialiserComposant(){

        editTextDescription = findViewById(R.id.editTextDesc);
        editTextPromotion = findViewById(R.id.editTextPromotion);
        editTextCategory = findViewById(R.id.editTextCat);
        editTextDateTravail = findViewById(R.id.editTextDate);
        buttonAjouterPhoto = findViewById(R.id.btnAjouterPhoto);
        buttonAjouterTravail = findViewById(R.id.btnAjouterTravail);
        progressBar = findViewById(R.id.progressBar);
        tvNomsPhoto = findViewById(R.id.tvImages);
    }

    private void verificationConfirmation(){
        buttonAjouterTravail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = editTextDescription.getText().toString();
                String promotion = editTextPromotion.getText().toString();
                String categorie = editTextCategory.getText().toString();
                String date = editTextDateTravail.getText().toString();

                if (description.isEmpty()){
                    Toast.makeText(
                            AjouterTravailActivity.this,
                            "Le champs description ne doit pas être vide ! ",
                            Toast.LENGTH_LONG
                    ).show();
                }else if (promotion.isEmpty()){
                    Toast.makeText(
                            AjouterTravailActivity.this,
                            "Le champ promotion ne doit  pas être vide ! ",
                            Toast.LENGTH_LONG
                    ).show();
                }else  if (categorie.isEmpty()){
                    Toast.makeText(
                            AjouterTravailActivity.this,
                            "Le champ categorie ne doit pas être vide !",
                            Toast.LENGTH_LONG
                    ).show();
                }else if (date.isEmpty()){
                    Toast.makeText(
                            AjouterTravailActivity.this,
                            "Le champ date ne doit pas etre vide",
                            Toast.LENGTH_LONG
                    ).show();
                }else {
                    retourHomePage();
                }

            }
        });
    }

    private void retourHomePage(){
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
    }


}