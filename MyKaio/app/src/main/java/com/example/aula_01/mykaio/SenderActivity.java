package com.example.aula_01.mykaio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class SenderActivity extends AppCompatActivity {


     Button meuBotao;
     EditText meuCampo;
     String valorDoCampo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sender_main);

        meuBotao=(Button)findViewById(R.id.button);
        meuCampo=(EditText) findViewById(R.id.EditText2);

        }

        public void clicandoNoBotao(View v){

            Toast.makeText(this,"bem vindo",Toast.LENGTH_SHORT).show();
            Intent meuIntent = new Intent(SenderActivity.this,Receptor_activity.class);
            valorDoCampo = meuCampo.getText().toString();
            Bundle meuBundle = new Bundle();
            meuBundle.putString("MINHA_CHAVE", valorDoCampo);
            meuIntent.putExtras(meuBundle);
            startActivity(meuIntent);

        }

    }

