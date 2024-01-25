package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lablist extends AppCompatActivity {
    private Button btn1=null;
           Button btn3=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lablist);
        this.getResources().getDrawable(R.drawable.ic_launcher_background);
        btn1=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn4);

    }
    public void method1(View view){
    Intent intent=new Intent(Lablist.this, application.class);
    this.startActivity(intent);
    }
    public void myclick(View view){
    Intent intent=new Intent(Lablist.this, underdevelopment.class);
    this.startActivity(intent); }
}