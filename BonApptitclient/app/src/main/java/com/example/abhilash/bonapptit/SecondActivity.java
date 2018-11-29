package com.example.abhilash.bonapptit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button breakfast_btn;
    Button lunch_btn;
    Button dinner_btn;
    Button back_btn;
    Bundle bundle;
    Intent oldIntent;
    Intent newIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        oldIntent = getIntent();
        bundle = oldIntent.getBundleExtra("bundle");

        breakfast_btn = (Button) findViewById(R.id.breakfast_button);
        breakfast_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO implement this: newIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                bundle.putInt("menuType", Keys.MENU_BREAKFAST);
                newIntent.putExtra("bundle", bundle);
                startActivity(newIntent);
            }
        });

        lunch_btn = (Button) findViewById(R.id.lunch_button);
        lunch_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO implement this: newIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                bundle.putInt("menuType", Keys.MENU_LUNCH);
                newIntent.putExtra("bundle", bundle);
                startActivity(newIntent);
            }
        });

        dinner_btn = (Button) findViewById(R.id.dinner_button);
        dinner_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO implement this: newIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                bundle.putInt("menuType", Keys.MENU_DINNER);
                newIntent.putExtra("bundle", bundle);
                startActivity(newIntent);
            }
        });

        back_btn = (Button) findViewById(R.id.back_button);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newIntent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(newIntent);
            }
        });
    }
}
