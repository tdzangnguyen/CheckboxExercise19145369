package com.android.exercise2_week8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1= findViewById(R.id.c_chocolate);
        c2= findViewById(R.id.c_sprinkles);
        c3= findViewById(R.id.c_crushed);
        c4= findViewById(R.id.c_cherries);
        c5= findViewById(R.id.c_orlo);
    }

    public void Show(View view) {
        String display = "Toppings:";
        if(c1.isChecked()==true){
            display= display +" "+c1.getText().toString();
        }
        if(c2.isChecked()==true){
            display= display +" "+c2.getText().toString();
        }
        if(c3.isChecked()==true){
            display= display +" "+c3.getText().toString();
        }
        if(c4.isChecked()==true){
            display= display +" "+c4.getText().toString();
        }
        if(c5.isChecked()==true){
            display= display +" "+c5.getText().toString();
        }
        Toast.makeText(getApplicationContext(),display, Toast.LENGTH_SHORT).show();
    }
}