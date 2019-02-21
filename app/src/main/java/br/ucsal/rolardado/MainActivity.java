package br.ucsal.rolardado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView faceDado = findViewById(R.id.faceDado);
        faceDado.setImageResource(R.drawable.dice);
    }

    public void rolarDado(View view) {
        ImageView faceDado = findViewById(R.id.faceDado);

        Random rd = new Random();

        Integer numDado = rd.nextInt(6)+1;

        Log.d("num dado", numDado.toString());

        if(numDado == 1) {
            faceDado.setImageResource(R.drawable.dice1);
        }else if(numDado == 2) {
            faceDado.setImageResource(R.drawable.dice2);
        }else if(numDado == 3) {
            faceDado.setImageResource(R.drawable.dice3);
        }else if(numDado == 4) {
            faceDado.setImageResource(R.drawable.dice4);
        }else if(numDado == 5) {
            faceDado.setImageResource(R.drawable.dice5);
        }else if(numDado == 6) {
            faceDado.setImageResource(R.drawable.dice6);
        }
    }
}
