package com.mulualem.animalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mulualem.AnimalAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Animal> animals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recycler_View);
        animals = new ArrayList<>();

        animals.add(new  Animal("Fish",R.drawable.fish));
        animals.add(new  Animal("Giraffe",R.drawable.giraffe));
        animals.add(new  Animal("Horse",R.drawable.horse));
        animals.add(new  Animal("Lion",R.drawable.lion));
        animals.add(new  Animal("puppy",R.drawable.puppy));
        animals.add(new  Animal("Swan",R.drawable.swan));
        animals.add(new  Animal("Tiger",R.drawable.tiger));
        animals.add(new  Animal("Wolf",R.drawable.wolf));

        AnimalAdapter animalAdapter = new AnimalAdapter(animals,this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(animalAdapter);



    }
}