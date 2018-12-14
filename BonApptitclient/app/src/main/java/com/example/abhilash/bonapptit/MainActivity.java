package com.example.abhilash.bonapptit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private String name;
    private String tableNo;
    public Customer customers;
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
                    Bundle bundle=new Bundle();
                    bundle.putString("name",name);
                    bundle.putString("tableNo",tableNo);
                    Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("bundle", bundle);
                    startActivity(intent);
               }
            }
        } );
    }

    public void getInputandStore() {
        EditText editText = findViewById(R.id.etname);
        EditText editText1 = findViewById(R.id.ettnum);
        name=editText.getText().toString();
        tableNo=editText.getText().toString();
        Log.d("String value n","Value = "+name);
        customers = new Customer(name, tableNo);
        if ((!name.isEmpty()) && (!tableNo.isEmpty())) {
            mainActivity = true;
        }
    }

}
