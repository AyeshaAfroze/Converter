package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.offline2.R.id.button1;

public class MainActivity extends AppCompatActivity {

    private Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity.this,kgToLb.class);
                startActivity(intent);
            }
        });

        button2=findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity.this,lbToKg.class);
                startActivity(intent);
            }
        });

        button3=findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity.this,toInches.class);
                startActivity(intent);
            }
        });

        button4=findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity.this,toCm.class);
                startActivity(intent);
            }
        });

    }
}
