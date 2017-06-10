package com.example.user.intentwithbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button saveButton;
    Button deleteButton;
    ImageView pic1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveButton=(Button)findViewById(R.id.button1);
        deleteButton=(Button)findViewById(R.id.button2);
        pic1 = (ImageView)findViewById(R.id.imageView);
    }
    public void onButtonClick(View v){
        if(v.getId()==R.id.button1){
//            Intent newIntent=new Intent(this,NewActivity.class);
//            startActivity(newIntent);
            Toa
        }
        if(v.getId()==R.id.imageView){
            Intent newIntent=new Intent(this,NewActivity.class);
            startActivity(newIntent);
        }
    }
}
