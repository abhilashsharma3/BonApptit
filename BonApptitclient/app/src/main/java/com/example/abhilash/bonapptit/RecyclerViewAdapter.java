package com.example.abhilash.bonapptit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    ArrayList<MenuItem> menuItems;
    Context context;
    public RecyclerViewAdapter(Context context,ArrayList<MenuItem> menuItems){
        this.context=context;
        this.menuItems=menuItems;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
       Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        boolean atp=false;
        View view=layoutInflater.inflate(R.layout.activity_three,parent,atp);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder recyclerViewHolder, int i) {
        final MenuItem menuItem=menuItems.get(i);
        final int[] abc = {menuItem.getQuantity()};
        //Food Quantity
        String ab=Integer.toString(abc[0]);
       recyclerViewHolder.foodQty.setText(ab);

        recyclerViewHolder.foodName.setText(menuItem.getName());
        recyclerViewHolder.foodDesc.setText(menuItem.getDesc());
     //   final float foodPrice={menuItem.getPrice()};
        recyclerViewHolder.foodPrice.setText(Float.toString(menuItem.getPrice()));
       // Drawable drawable=new D
   //     recyclerViewHolder.imageView.setImageDrawable();
        recyclerViewHolder.incButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++abc[0];
                menuItem.setQuantity(abc[0]);
                String ab=Integer.toString(menuItem.getQuantity());
                recyclerViewHolder.foodQty.setText(ab);
                notifyDataSetChanged();
            }
        });
        recyclerViewHolder.decButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc[0]!=0){
                    --abc[0];
                    menuItem.setQuantity(abc[0]);
                    String ab=Integer.toString(menuItem.getQuantity());
                    recyclerViewHolder.foodQty.setText(ab);
                    notifyDataSetChanged();
                    notifyDataSetChanged();
                }
            }
        });
    }

    @Override
    public int getItemCount(){
        return menuItems.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView foodDesc;
        TextView foodName;
        TextView foodQty;
        Button incButton;
        RelativeLayout relativeLayout;
        TextView foodPrice;
        Button decButton;
        Button submit;

        public RecyclerViewHolder(View view) {
            super(view);
            relativeLayout=view.findViewById(R.id.relativeLayout);
            imageView=view.findViewById(R.id.imageView);
            foodName=view.findViewById(R.id.foodname);
            foodPrice=view.findViewById(R.id.foodPrice);
            foodDesc= view.findViewById(R.id.fooddesc);
            foodQty=view.findViewById(R.id.foodQty);
            incButton=view.findViewById(R.id.increment_button);
            decButton=view.findViewById(R.id.decrement_button);
            incButton=view.findViewById(R.id.increment_button);
            decButton=view.findViewById(R.id.decrement_button);

            view.setOnClickListener(this);
        }

//        public void decrement() {
//            int quantity = Integer.parseInt(foodQty.getText().toString());
//            menuItems.get()
//            foodQty.setText(Integer.toString(--quantity));
//        }
//
//        public void increment() {
//            int quantity = Integer.parseInt(foodQty.getText().toString());
//            foodQty.setText(Integer.toString(++quantity));
//        }

        @Override
        public void onClick(View v) {

        }
    }
}
