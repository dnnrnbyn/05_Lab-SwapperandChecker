package com.example.tpswapperandchecker;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
    }
    public void swapPos(View view){
        String txtOne = txt1.getText().toString();
        String txtTwo = txt2.getText().toString();
        txt1.setText(txtTwo);
        txt2.setText(txtOne);
    }
    public void checkSim(View view){
        String txtOne = txt1.getText().toString();
        String txtTwo = txt2.getText().toString();
        String result = "";
        if (txtOne.equals(txtTwo)) {
            result = "SAME";
        }
        else {
            result = "NOT THE SAME";
        }
        Intent i = new Intent(this, CheckDialog.class);
        i.putExtra("result", result);
        startActivity(i);
    }
}