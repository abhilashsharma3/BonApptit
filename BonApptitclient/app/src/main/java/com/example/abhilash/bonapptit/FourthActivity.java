package com.example.abhilash.bonapptit;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        Bundle bundle = getIntent().getBundleExtra("bundle");
        String name=bundle.getString("name");
        String tableNo=bundle.getString("tableNo");
        String totalPrice=bundle.getString("Price");
       TextView nameview=findViewById(R.id.username);
       TextView priceview=findViewById(R.id.price);
       TextView tableNum=findViewById(R.id.tbnum);
        Button button=findViewById(R.id.submitButton);
        final String order=bundle.getString("jsonString");
       nameview.setText(name);
       priceview.setText(totalPrice);
       tableNum.setText(tableNo);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getApplicationContext(),"Order Confirmed",Toast.LENGTH_LONG).show();
               Client client=new Client(order);
               client.execute();
           }
       });

    }
}
