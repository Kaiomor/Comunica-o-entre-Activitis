package com.example.aula_01.mykaio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Receptor_activity extends AppCompatActivity {

    private static final String MINHA_CHAVE= null;
    TextView meuTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receptor_activity);
        meuTexto = (TextView) findViewById(R.id.textView);
        Intent outroIntent = getIntent();
        Bundle outroBundle = outroIntent.getExtras();
        String umValor = outroBundle.getString("MINHA_CHAVE");
        meuTexto.setText(umValor);

    }
}
