package com.example.user.intentwithbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class NewActivity extends AppCompatActivity {
    Button toastButton;
    ImageView toastImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        toastButton=(Button)findViewById(tastbut);
    }
}
