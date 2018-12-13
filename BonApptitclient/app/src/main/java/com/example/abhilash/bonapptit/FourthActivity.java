package com.example.abhilash.bonapptit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        Bundle bundle = getIntent().getBundleExtra("bundle");
        String name=bundle.getString("name");
        String tableNo=bundle.getString("tableNo");
        String totalPrice=bundle.getString("Price");
       // TextView textView=findViewById()



    }
}
