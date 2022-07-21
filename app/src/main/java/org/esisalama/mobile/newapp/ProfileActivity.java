package org.esisalama.mobile.newapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.menu_modifier_profile){
            Toast.makeText(
                    ProfileActivity.this,
                    "Menu Modifier",
                    Toast.LENGTH_LONG
            ).show();
            Intent intent = new Intent(ProfileActivity.this,ModifierProfileActivity.class);
            startActivity(intent);


        } else if (item.getItemId() == R.id.menu_parametre) {
            Toast.makeText(

                    ProfileActivity.this,
                    "Menu Paramètre",
                    Toast.LENGTH_LONG
            ).show();

        }
        return super.onOptionsItemSelected(item);
    }
}