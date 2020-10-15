package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textEntry;
    private Button changeActivityButton;
    private Button goToActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeActivityButton = findViewById(R.id.change_activity);
        goToActivityButton = findViewById(R.id.go_to_activity);
        textEntry = findViewById(R.id.et_text_entry);

        changeActivityButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String textEntered = textEntry.getText().toString();
                Context context = MainActivity.this;
                Class destinationActivity = SecondActivity.class;
                Intent secondActivityIntent = new Intent(context, destinationActivity);
                secondActivityIntent.putExtra(Intent.EXTRA_TEXT, textEntered);
                startActivity(secondActivityIntent);

            }
        });

        goToActivityButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String textEntered = textEntry.getText().toString();
                Context context = MainActivity.this;
                Class destinationActivity = SecondActivity.class;
                Intent secondActivityIntent = new Intent(context, destinationActivity);
                secondActivityIntent.putExtra(Intent.EXTRA_REFERRER, textEntered);
                startActivity(secondActivityIntent);

            }
        });

    }
}