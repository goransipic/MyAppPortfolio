package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mButton0;
    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton0 = (Button) findViewById(R.id.button_main_0);
        mButton1 = (Button) findViewById(R.id.button_main_1);
        mButton2 = (Button) findViewById(R.id.button_main_2);
        mButton3 = (Button) findViewById(R.id.button_main_3);
        mButton4 = (Button) findViewById(R.id.button_main_4);
        mButton5 = (Button) findViewById(R.id.button_main_5);
    }

    public void onClickButton0(View view) {
        Toast.makeText(this, R.string.toast_massage_0, Toast.LENGTH_LONG).show();
    }

    public void onClickButton1(View view) {
        Toast.makeText(this, R.string.toast_message_1, Toast.LENGTH_LONG).show();
    }

    public void onClickButton2(View view) {
        Toast.makeText(this, R.string.toast_message_2, Toast.LENGTH_LONG).show();
    }

    public void onClickButton3(View view) {
        Toast.makeText(this, R.string.toast_message_3, Toast.LENGTH_LONG).show();
    }

    public void onClickButton4(View view) {
        Toast.makeText(this, R.string.toast_message_4, Toast.LENGTH_LONG).show();
    }

    public void onClickButton5(View view) {
        Toast.makeText(this, R.string.toast_message_5, Toast.LENGTH_LONG).show();
    }
}
