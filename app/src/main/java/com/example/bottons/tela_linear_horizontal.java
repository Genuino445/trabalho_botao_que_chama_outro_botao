package com.example.bottons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class tela_linear_horizontal extends AppCompatActivity {
    private Button sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_linear_horizontal);

        sair = (Button) findViewById(R.id.Sair);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tela_linear_horizontal.this, MainActivity.class);
                startActivity(intent);
            }
        });
    };
};
