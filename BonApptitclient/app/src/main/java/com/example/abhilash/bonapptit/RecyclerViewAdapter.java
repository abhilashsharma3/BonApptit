package com.example.abhilash.bonapptit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    ArrayList<MenuItem> menuItems;
    Context context;
    public RecyclerViewAdapter(Context context,ArrayList<MenuItem> menuItems){
        this.context=context;
        this.menuItems=menuItems;
    }

    @Override
    public RecyclerViewAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
       Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        boolean atp=false;
        View view=layoutInflater.inflate(R.layout.activity_three,parent,atp);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {
        MenuItem menuItem=menuItems.get(i);
        recyclerViewHolder.foodQty.setText(menuItem.getQuantity());
        recyclerViewHolder.foodName.setText(menuItem.getName());
        recyclerViewHolder.foodDesc.setText(menuItem.getDesc());


//        Picasso.with(context).load()
//                .resize(360,210)
//                .into(holder.imageView);
    }

    @Override
    public int getItemCount(){
        return menuItems.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView foodDesc;
        TextView foodName;
        EditText foodQty;

        public RecyclerViewHolder(View view) {
            super(view);
            imageView=view.findViewById(R.id.imageView);
            foodName=view.findViewById(R.id.foodname);
            foodDesc= view.findViewById(R.id.fooddesc);
            foodQty=view.findViewById(R.id.foodqty);

        }
    }
    }
