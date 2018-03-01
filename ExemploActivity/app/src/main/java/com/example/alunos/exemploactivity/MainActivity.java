package com.example.alunos.exemploactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudaTexto(View V){
        TextView etiqueta = (TextView) findViewById(R.id.textView);
        etiqueta.setText(getResources().getString(R.string.lblHello2));
    }

    public static void jogoTentativa(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        int acerto = gerador.nextInt(11);
        int tentativa;
        int numerotentativa = 3;
        do{
            System.out.printf("Digite um numero: ");
            tentativa = input.nextInt();
            if (tentativa == acerto){
                System.out.printf("Voce acertou Parabens!");
                numerotentativa = 0;
            }else {
                numerotentativa--;
            }
        } while(numerotentativa > 0);
    }
}
