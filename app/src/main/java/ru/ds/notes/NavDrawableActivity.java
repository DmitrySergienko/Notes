package ru.ds.notes;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class NavDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawable);

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
      // Toolbar toolbar = findViewById(R.id.toolbar);

      //ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
      //        this,
      //        drawerLayout,
      //        toolbar,
      //        R.string.app_name,
      //        R.string.app_name

      //);
       //drawerLayout.addDrawerListener(toggle);
       ////для сцепления шторки с toolbar
       //toggle.syncState();

        NavigationView navigationView  = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                drawerLayout.closeDrawer(GravityCompat.START);
                if(item.getItemId() == R.id.option_one){
                    getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.cont,new FrContent())
                    .commit();

                    return true;
                }
                if(item.getItemId() == R.id.option_two) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.cont, new FrPhoto())
                            .commit();

                    return true;

                }
                if(item.getItemId() == R.id.option_three) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.cont, new FrDescrip())
                            .commit();

                    return true;

                }
                if(item.getItemId() == R.id.option_three) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.cont, new FrInfo())
                            .commit();

                    return true;
                }return false;
            }

        });
    }
}