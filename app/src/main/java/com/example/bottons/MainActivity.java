package com.example.bottons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button tela_linear_horizontal;
    private Button btn_mapa;
    private Button btn_lateral;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tela_linear_horizontal = (Button) findViewById( R.id.tela_linear_horizontal);
        btn_mapa = (Button) findViewById(R.id.btn_mapa);
        btn_lateral = (Button) findViewById(R.id.lateral);


        tela_linear_horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, tela_linear_horizontal.class);
                startActivity(intent);

            }
        });

        btn_lateral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, btn_lateral.class);
                startActivity(intent);
            }
        });

        btn_mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, btn_mapa.class);
                startActivity(intent);

            }
        });

    }
}
