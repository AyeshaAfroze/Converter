package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class toInches extends AppCompatActivity {
    private Button con1;
    EditText editText1;
    TextView res1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_inches);

        editText1=findViewById(R.id.editText1);
        res1=findViewById(R.id.res1);


        con1=findViewById (R.id.con1);
        con1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                double n1;
                n1=Double.parseDouble(editText1.getText().toString());
                double result = n1 / 2.54;
                res1.setText(String.format("%.4f",result));

                Toast.makeText(toInches.this,"DONE!",Toast.LENGTH_SHORT).show();


            }
        });
    }
}
