package com.example.alunos.exemplorecyclerview;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;

import android.support.v7.widget.RecyclerView;

import com.example.alunos.exemplorecyclerview.adapter.LivroAdapter;

import com.example.alunos.exemplorecyclerview.model.Livro;

import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity{

    private ArrayList<Livro> list_book;

    RecyclerView view;

    @Override

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        view = findViewById(R.id.recyclerView);

        list_book = new ArrayList<>();

        list_book.add(new Livro ("O Senhor dos Anéis", "J. R. R. Tolkien",
                "Fantasia épica onde elfos, anões, hobbits e homens enfrentam os poderes do mal."));
        list_book.add(new Livro ("Uma breve história do Tempo", "Stephen W. Hawking",
                "Uma introdução a alguns dos conceitos mais profundos da Física"));
        list_book.add(new Livro ("A espada da galáxia", "Marcelo Cassaro",
                        "A premiada ficção científica onde alienígenas rivais resolvem suas disputas na Terra. "));

        view.setAdapter(new LivroAdapter(list_book, this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        view.setLayoutManager(layout);

    }

}
