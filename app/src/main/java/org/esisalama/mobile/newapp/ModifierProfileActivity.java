package org.esisalama.mobile.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import java.util.Locale;

public class ModifierProfileActivity extends AppCompatActivity {

    private EditText editTextAncienMdp;
    private EditText editTextNewMdp;
    private EditText editTextConfirmerMdp;
    private Button buttonModifier;


    private void retourHomePage(){
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_profile);

        editTextAncienMdp = findViewById(R.id.editextAncienmdp);
        editTextNewMdp = findViewById(R.id.editextnouveauMdp);

        editTextConfirmerMdp = findViewById(R.id.editTextCofirmer);
        buttonModifier = findViewById(R.id.btnModifier);

        buttonModifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ancienMdp = editTextAncienMdp.getText().toString();
                String nouveauMdp = editTextNewMdp.getText().toString();
                String confirmerNewMdp = editTextConfirmerMdp.getText().toString();

                if (!ancienMdp.toUpperCase().equals("19SM476")) {
                    Toast.makeText(
                            ModifierProfileActivity.this,
                            "L'ancien mot de passe est incorrect",
                            Toast.LENGTH_LONG
                    ).show();

                }else if (nouveauMdp.isEmpty() || (nouveauMdp.length() < 6)) {
                        if (nouveauMdp.isEmpty()) {
                            Toast.makeText(
                                    ModifierProfileActivity.this,
                                    "Le nouveau mot de passe ne doit pas etre vide",
                                    Toast.LENGTH_LONG
                            ).show();
                        } else {
                            Toast.makeText(
                                    ModifierProfileActivity.this,
                                    "Le nouveau mot de passe ne doit pas etre vide",
                                    Toast.LENGTH_LONG
                            ).show();
                        }
                } else if (confirmerNewMdp.isEmpty() || confirmerNewMdp.length() < 6 || !confirmerNewMdp.equals(nouveauMdp)) {
                    if (confirmerNewMdp.isEmpty()) {
                        Toast.makeText(
                            ModifierProfileActivity.this,
                            "Veuillez confirmer le snouveau mot de passe",
                             Toast.LENGTH_LONG
                        ).show();
                    } else if (confirmerNewMdp.length() < 6) {
                        Toast.makeText(
                            ModifierProfileActivity.this,
                            "Le nouveau de passe doit contenir au moins 6 caractères !",
                             Toast.LENGTH_LONG
                        ).show();
                    }else {
                        Toast.makeText(
                             ModifierProfileActivity.this,
                              "mot de passe différent du nouveau!",
                              Toast.LENGTH_LONG
                        ).show();

                    }
                } else {
                    retourHomePage();
                }

            }

        });


    }
}