package ru.ds.notes;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Launcher extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);


    }

    public void onStartLaunch(View view) {
        Intent intent = new Intent(Launcher.this, NavDrawableActivity.class);
        startActivity(intent);

    }
}
