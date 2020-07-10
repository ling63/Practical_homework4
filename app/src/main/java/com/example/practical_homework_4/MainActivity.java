package com.example.practical_homework_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addListenerOnButtonClick(){
        CheckBox chocolate_syrup = (CheckBox) findViewById(R.id.chk_chocolate_syrup);
        CheckBox sprinkles = (CheckBox) findViewById(R.id.chkSprinkles);
        CheckBox crushed_nuts = (CheckBox) findViewById(R.id.chk_Crushed);
        CheckBox charries = (CheckBox) findViewById(R.id.chk_Cherries);
        CheckBox orio_cookies = (CheckBox) findViewById(R.id.chk_Orio);
        Button show_toast = (Button) findViewById(R.id.toast);
        show_toast.setOnClickListener((View view){
            StringBuilder result = new StringBuilder();
            result.append("Toppings:");

            if(chocolate_syrup.isChecked()){
                result.append("Chocolate Syrup" + "");
            }

            if(sprinkles.isChecked()){
                result.append("Sprinkles" + "");
            }

            if(crushed_nuts.isChecked()){
                result.append("Crushed Nuts" + "");
            }

            if(charries.isChecked()){
                result.append("Cherries" +"");
            }

            if(orio_cookies.isChecked()){
                result.append("Orio Cookie Crumbles" +"");
            }
            Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
        });
    }

}
