package com.example.multiactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class JogoActivity extends AppCompatActivity {

    ImageView resultado;
    ImageView voltar;
    String caraCoroa;
    Bundle dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        resultado = findViewById(R.id.resultado);
        voltar = findViewById(R.id.voltar);

        dados = getIntent().getExtras();
        caraCoroa = dados.getString("resultado");

        if (caraCoroa.equals("Coroa")){
            resultado.setImageResource(R.drawable.moeda_coroa);
        }

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}
