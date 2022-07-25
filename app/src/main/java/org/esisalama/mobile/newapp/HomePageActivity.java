package org.esisalama.mobile.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        checkSessionActive();

        configurerButtonLProfile();
        configurerButtonAjouter();
        configurerButtonListeTravail();
    }

    private void checkSessionActive() {
        sharedPreferences = getSharedPreferences("session", MODE_PRIVATE);
        boolean sessionActive = sharedPreferences.getBoolean("session_active", false);

        if (!sessionActive) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }

    private void configurerButtonListeTravail() {
        Button btnListeTrav = findViewById(R.id.btnlisteTravail);
        btnListeTrav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, ListeTravailActivity.class);
                startActivity(intent);
            }
        });
    }

    private void configurerButtonAjouter() {
        Button btnAjouter = findViewById(R.id.btnAjouter);
        btnAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, AjouterTravailActivity.class);
                startActivity(intent);
            }
        });
    }

    private void configurerButtonLProfile() {
        Button btnProfile = findViewById(R.id.btnProfiel);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}