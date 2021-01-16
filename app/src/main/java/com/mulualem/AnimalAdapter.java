package com.mulualem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mulualem.animalapp.Animal;
import com.mulualem.animalapp.R;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter <AnimalAdapter.AnimalRowHolder>{
    //create some parameter
    ArrayList<Animal> animalData;
    Context context;
    //we create constructor

    public AnimalAdapter(ArrayList<Animal>animalData,Context context){

        this.context = context;

        this.animalData = animalData;

    }


    @NonNull
    @Override
    public AnimalRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.animal_row,parent,false);

        return new AnimalRowHolder(view);
    }

    @Override //we use this methode when we scroll down to recover the disapeared raw

    public void onBindViewHolder(@NonNull AnimalRowHolder holder, int position) {
        holder.txtAnimalName.setText(animalData.get(position).getImage());
        holder.imgAnimal.setImageResource(animalData.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return animalData.size();
    }

    //we will create an object for place holder(for the image and for the txt )
    class AnimalRowHolder extends RecyclerView.ViewHolder{

        TextView txtAnimalName;
        ImageView imgAnimal;

        public AnimalRowHolder(@NonNull View itemView) {
            super(itemView);
            //initialise

            txtAnimalName = itemView.findViewById(R.id.txt_animal_name);
            imgAnimal = itemView.findViewById(R.id.img_animal);

        }
    }


}
