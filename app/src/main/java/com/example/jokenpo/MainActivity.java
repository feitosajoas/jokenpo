package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("Pedra");
    }
    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("Papel");
    }
    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("Tesoura");
    }
    public void opcaoSelecionada(String opcaoSelecionada){
        System.out.println("Item clicado: " + opcaoSelecionada);

    }
}