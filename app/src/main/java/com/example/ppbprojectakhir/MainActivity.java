package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private NavigationView navigationView;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout,R.string.open,R.string.close);
        mToggle.syncState();
        mDrawerLayout.addDrawerListener(mToggle);

        navigationView = (NavigationView) findViewById(R.id.nav_menu);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        // Setup Button

        View btnGram = findViewById(R.id.gram);
        btnGram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pindah2(v);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        if(id == R.id.kosakata){
            Intent intent = new Intent(MainActivity.this, VocabularyLayout.class);
            startActivity(intent);
        }
        if(id == R.id.hafalan){
            Intent intent = new Intent(MainActivity.this, HafalanLayout.class);
            startActivity(intent);
        }
        if(id == R.id.grammar){
            Intent intent = new Intent(MainActivity.this, GrammarLayout.class);
            startActivity(intent);
        }
        if(id == R.id.tenses){
            Intent intent = new Intent(MainActivity.this, TensesLayout.class);
            startActivity(intent);
        }
        if(id == R.id.latihan1){
            Intent intent = new Intent(MainActivity.this, Latihan1Layout.class);
            startActivity(intent);
        }
        if(id == R.id.latihan2){
            Intent intent = new Intent(MainActivity.this, Latihan2Layout.class);
            startActivity(intent);
        }
        if(id == R.id.percakapan){
            Intent intent = new Intent(MainActivity.this, PercakapanLayout.class);
            startActivity(intent);
        }
        if(id == R.id.share){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id= h1");
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent, "Share via"));
            startActivity(intent);
        }
        if(id == R.id.send){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id= h1");
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent, "Send via"));
            startActivity(intent);
        }
        return true;
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, VocabularyLayout.class);
        startActivity(intent);
    }
    public void Pindah1(View view) {
        Intent intent = new Intent(MainActivity.this, HafalanLayout.class);
        startActivity(intent);
    }
    public void Pindah2(View view) {
        Intent intent = new Intent(MainActivity.this, GrammarLayout.class);
        startActivity(intent);
    }
    public void Pindah3(View view) {
        Intent intent = new Intent(MainActivity.this, TensesLayout.class);
        startActivity(intent);
    }
    public void Pindah4(View view) {
        Intent intent = new Intent(MainActivity.this, Latihan1Layout.class);
        startActivity(intent);
    }
    public void Pindah5(View view) {
        Intent intent = new Intent(MainActivity.this, Latihan2Layout.class);
        startActivity(intent);
    }
    public void Pindah6(View view) {
        Intent intent = new Intent(MainActivity.this, UjianLayout.class);
        startActivity(intent);
    }
    public void Pindah7(View view) {
        Intent intent = new Intent(MainActivity.this, PercakapanLayout.class);
        startActivity(intent);
    }
    public void Pindah8(View view) {
        Intent intent = new Intent(MainActivity.this, GameLoading.class);
        startActivity(intent);
    }
}
