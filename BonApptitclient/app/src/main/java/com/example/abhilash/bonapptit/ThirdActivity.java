package com.example.abhilash.bonapptit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.Switch;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {

    ImageView imageView;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<MenuItem> menuItem;
    int menutype;
    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        Bundle bundle=getIntent().getBundleExtra("bundle");
        menutype=bundle.getInt("menuType");
        setContentView(R.layout.activity_three);
        defineMenu();
        recyclerView=findViewById(R.id.recyclerview);
        recyclerViewAdapter=new RecyclerViewAdapter(this,menuItem);
    }

    private void defineMenu() {
        switch (menutype){
            case Keys.MENU_BREAKFAST:
                //TODO add breakfast menu
                break;
            case Keys.MENU_LUNCH:
                //TODO add Lunch
                break;
            case Keys.MENU_DINNER:
                //Todo add dinner

        }
    }
}
