package com.example.sharita.practica4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.ActionBar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.acercaDe) {
            Intent i= new Intent(this, AcercaDe.class);
            startActivity(i);
        }
        if (id== R.id.turismo){
            Intent i= new Intent(this, Sitios_turisticos.class);
            startActivity(i);
        }

        if (id== R.id.hoteles){
            Intent i= new Intent(this, Hoteles.class);
            startActivity(i);
        }

        if (id== R.id.bares){
            Intent i= new Intent(this, Bares.class);
            startActivity(i);
        }

        if (id== R.id.informacion){
            Intent i= new Intent(this, Info_demografica.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
