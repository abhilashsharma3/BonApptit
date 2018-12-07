package com.example.abhilash.bonapptit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private String name;
    private String tableNo;
    private Customer customers;
    boolean mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.submitbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInputandStore();
                if (mainActivity){
                    Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
            }
        } );


    }

    public void getInputandStore() {
        this.name = findViewById(R.id.etname).toString();
        String n = findViewById(R.id.ettnum).toString();
        Log.d("String value n","Value = "+n);
        customers = new Customer(name, tableNo);
        if ((!name.isEmpty()) && (!n.isEmpty())) {
            mainActivity = true;
        }
    }

}
