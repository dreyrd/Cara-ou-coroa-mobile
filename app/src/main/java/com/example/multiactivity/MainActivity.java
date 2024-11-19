package com.example.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {

    Random random;
    String caraCoroa;

    ImageView jogarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();
        jogarButton = findViewById(R.id.jogarButton);

        jogarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caraCoroa = random.nextInt(2) == 1? "Cara" : "Coroa";

                Intent intent = new Intent(getApplicationContext(), JogoActivity.class);

                intent.putExtra("resultado", caraCoroa);
                startActivity(intent);
            }
        });

    }


}