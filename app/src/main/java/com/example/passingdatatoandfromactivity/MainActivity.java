package com.example.passingdatatoandfromactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    TextView mainActivityTextView;
    Button sendDataToActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate() : ");

        mainActivityTextView = findViewById(R.id.textViewHOme);
        sendDataToActivityButton = findViewById(R.id.sendData2ActiviytBtnID);

        sendDataToActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick() : ");

//        TODO : using intent
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("second","Hi Second Activity");
//        startActivity(intent);

//        TODO : uncomment this for onActivityResult
        startActivityForResult(intent, 2);

//        TODO : using bundle
        /*Bundle bundle = new Bundle();
        bundle.putString("Name", "Chanchal");

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NewPerson",bundle);

        startActivity(intent);*/
    }

//        TODO : uncomment this for onActivityResult
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult() : ");

        if (requestCode == 2) {
            Toast.makeText(this, data.getStringExtra("to first").toString(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() : ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() : ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() : ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() : ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() : ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() : ");
    }
}