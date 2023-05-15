package com.example.tpswapperandchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class CheckDialog extends AppCompatActivity {
    TextView resultDialog;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_dialog);
        resultDialog = findViewById(R.id.resultDialog);
        String result = getIntent().getExtras().getString("result");
        resultDialog.setText(result);
    }
}