package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
    }
    public void s3
            (View view){
        Intent intent=new Intent(homepage.this, Lablist.class);
        this.startActivity(intent);
    }
    public void ben(View view){
        Intent intent=new Intent(homepage.this, underdevelopment.class);
        this.startActivity(intent);
    }
}