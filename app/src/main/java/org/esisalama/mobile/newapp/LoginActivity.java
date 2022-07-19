package org.esisalama.mobile.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    EditText edMatricule  = findViewById(R.id.editTextMatricule);
    EditText editPassword = findViewById(R.id.editTextPassWord);
    Button  boutonLogin = findViewById(R.id.button_login);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ProgressBar progressBar = findViewById(R.id.progress_bar);

        boutonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricule = edMatricule.getText().toString();
                String password = editPassword.getText().toString();
                if (matricule.isEmpty()) {
                    Toast.makeText(
                            LoginActivity.this,
                            "Le matricule ne doit pas etre vide",
                            Toast.LENGTH_LONG
                    ).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(
                            LoginActivity.this,
                            "Le mot de passe ne doit pas etre vide",
                            Toast.LENGTH_LONG
                    ).show();
                } else {
                    login(matricule, password);
                }
            }
        });
    }



    private void login(String matricule, String password) {
        progressBar.setVisibility(View.VISIBLE);
        boutonLogin.setEnabled(false);
        SharedPreferences session = getSharedPreferences("session", 0);
        session.edit().putBoolean("session_active", true).apply();
    }
}