package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView screen;
    private String display="";
    private EditText inputtext;
    private String currentOperator="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView)findViewById(R.id.input_box);
        screen.setText(display);
        inputtext = findViewById(R.id.input_box);
    }

    private void appendToLast(String str) {
        this.inputtext.getText().append(str);
    }

    public void onClickNumber(View v) {
        Button b = (Button) v;
        display += b.getText();
        appendToLast(display);
        display="";
    }

    public void onClickOperator(View v) {
        Button b = (Button) v;
        display += b.getText();
        appendToLast(display);
        display="";
        currentOperator = b.getText().toString();
    }

    public void onClearButton(View v) {
        inputtext.getText().clear();
    }

}
