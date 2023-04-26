package com.example.kockica_jurkovic;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button generateBtn;
    TextView number1TextView, number2TextView;
    View mainLayout;
    int colorIndex = 0;
    int[] backgroundColors = {Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateBtn = findViewById(R.id.generate_btn);
        number1TextView = findViewById(R.id.number1_textview);
        number2TextView = findViewById(R.id.number2_textview);
        mainLayout = findViewById(R.id.main_layout);

        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Generiranje dva broja
                Random random = new Random();
                int number1 = random.nextInt(6) + 1;
                int number2 = random.nextInt(6) + 1;

                // Generiranje brojeva u TextView
                number1TextView.setText(String.valueOf(number1));
                number2TextView.setText(String.valueOf(number2));

                // Promjena pozadine aplikacije
                mainLayout.setBackgroundColor(backgroundColors[colorIndex]);
                colorIndex = (colorIndex + 1) % backgroundColors.length;
            }
        });
    }
}
