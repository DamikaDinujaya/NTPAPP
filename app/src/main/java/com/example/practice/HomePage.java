package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
Button insert;
Button update;
Button delete;
Button detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        insert=(Button)findViewById(R.id.button2);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insert1=new Intent(HomePage.this,Insert.class);
                HomePage.this.startActivity(insert1);
            }
        });

        update=(Button)findViewById(R.id.button5);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent update1=new Intent(HomePage.this,Update.class);
                HomePage.this.startActivity(update1);
            }
        });
//jva
        delete=(Button)findViewById(R.id.button6);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent delete1=new Intent(HomePage.this,Delete.class);
                HomePage.this.startActivity(delete1);
            }
        });
        detail=(Button)findViewById(R.id.button7);

        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detail1=new Intent(HomePage.this,Detail.class);
                HomePage.this.startActivity(detail1);
            }
        });
    }
}