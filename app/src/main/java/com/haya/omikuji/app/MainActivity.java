package com.haya.omikuji.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button omikujibutton = findViewById(R.id.omikuji_Button);
        omikujibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String unsei = "";
                Random random = new Random();
                switch (random.nextInt( 5)) {
                    case 0:
                        unsei = "大吉";
                        break;
                    case 1:
                        unsei = "吉";
                        break;
                    case 2:
                        unsei = "中吉";
                        break;
                    case 3:
                        unsei = "小吉";
                        break;
                    case 4:
                        unsei = "末吉";
                        break;
                    case 5:
                        unsei = "凶";
                }
                Toast.makeText(MainActivity.this, unsei, Toast.LENGTH_SHORT).show();
            }
        });
    }
}