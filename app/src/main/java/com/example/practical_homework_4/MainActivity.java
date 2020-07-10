package com.example.practical_homework_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CheckBox chocolate_syrup,sprinkles,crushed_nuts,charries,orio_cookies;
    private Button show_toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick()
    {
        chocolate_syrup = (CheckBox) findViewById(R.id.chk_chocolate_syrup);
        sprinkles = (CheckBox) findViewById(R.id.chkSprinkles);
        crushed_nuts = (CheckBox) findViewById(R.id.chk_Crushed);
        charries = (CheckBox) findViewById(R.id.chk_Cherries);
        orio_cookies = (CheckBox) findViewById(R.id.chk_Orio);
        show_toast = (Button) findViewById(R.id.toast);
        show_toast.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {

                StringBuffer result = new StringBuffer();
                result.append("Toppings:");

                if (chocolate_syrup.isChecked()) {
                    result.append("Chocolate Syrup" + "");
                }

                if (sprinkles.isChecked()) {
                    result.append("Sprinkles" + "");
                }

                if (crushed_nuts.isChecked()) {
                    result.append("Crushed Nuts" + "");
                }

                if (charries.isChecked()) {
                    result.append("Cherries" + "");
                }

                if (orio_cookies.isChecked()) {
                    result.append("Orio Cookie Crumbles" + "");
                }
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
