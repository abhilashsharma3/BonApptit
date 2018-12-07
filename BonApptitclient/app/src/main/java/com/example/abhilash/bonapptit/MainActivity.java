package com.example.abhilash.bonapptit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String name;
    private int tableNo;
    private Customer customers;
    boolean mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getInputandStore();
        if (mainActivity){
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }

    }

    public void getInputandStore(){
        this.name=findViewById(R.id.etname).toString();
        this.tableNo=findViewById(R.id.ettnum);
        customers= new Customer(name,tableNo);
    }


}
