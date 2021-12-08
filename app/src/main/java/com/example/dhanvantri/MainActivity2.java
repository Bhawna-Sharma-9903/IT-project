package com.example.dhanvantri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    String TAG ="MainActivity2" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageButton Beauty= (ImageButton) findViewById(R.id.imageButton);
        Beauty.setImageResource(R.drawable.beauty_2);
       /* Intent intent= new Intent(MainActivity2.this, Main);
        startActivity(intent);*/

        ImageButton General_tips= (ImageButton) findViewById(R.id.imageButton2);
        Beauty.setImageResource(R.drawable.hrt_3);
        Intent intent= new Intent(MainActivity2.this, MainActivity6.class);
        startActivity(intent);

        ImageButton yoga= (ImageButton) findViewById(R.id.imageButton3);
        Beauty.setImageResource(R.drawable.meditate_1);
        /*Intent intent= new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);*/


        setContentView(R.layout.activity_main);
        Log.i(TAG,"--onCreate--");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "--onStart--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "--onRestart--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "--onPause--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "--onResume--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "--onStop--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "--onDestroy--");
    }
}
