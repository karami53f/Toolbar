package com.example.toolbar;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar tb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1= findViewById(R.id.tb1);
        setSupportActionBar(tb1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tb1.setLogo(R.drawable.java);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if (id==R.id.stting_tb){
            Toast.makeText(getApplicationContext(),"Setting Item Clicked",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.about){
            Toast.makeText(getApplicationContext(),"About Item Clicked",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.basket){
            Toast.makeText(getApplicationContext(),"Basket Item Clicked",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.profile){
            Toast.makeText(getApplicationContext(),"Profile Item Clicked",Toast.LENGTH_LONG).show();
        }
        else if (id == android.R.id.home){
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
