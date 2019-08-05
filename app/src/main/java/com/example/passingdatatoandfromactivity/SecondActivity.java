package com.example.passingdatatoandfromactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "SecondActivity";

    TextView secondActivityTextView;
    Button sendDataToFirstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate() : ");

        secondActivityTextView = findViewById(R.id.secondActivityTVID);
        sendDataToFirstButton = findViewById(R.id.sendDataToFirstBtnID);

//        TODO : using intent
        /*String dataFromFirst = getIntent().getStringExtra("second");
        Toast.makeText(this,dataFromFirst,Toast.LENGTH_SHORT).show();*/

//        TODO : uncomment this for onActivityResult
        Toast.makeText(this, "Hello Second Activity", Toast.LENGTH_SHORT).show();
        sendDataToFirstButton.setOnClickListener(this);

//      TODO : using bundle
        /*Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("NewPerson");

        String name = bundle.getString("Name");

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();*/
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick() : ");
        sendDataToFirst();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "onBackPressed() : ");

//        TODO : uncomment this for onActivityResult
        sendDataToFirst();
    }

    private void sendDataToFirst() {
        Intent intent = new Intent();
        intent.putExtra("to first", "Hello First Activity");

        setResult(2, intent);
        finish();
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
