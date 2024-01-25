package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class application extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.application);

    }
    public void tongyi(View view){
        Intent intent=new Intent(application.this, form.class);
        this.startActivity(intent); }
    public void xiangxi1(View view){
        Intent intent=new Intent(application.this, details.class);
        this.startActivity(intent); }
}