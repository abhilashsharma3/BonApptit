package com.example.abhilash.bonapptit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.abhilash.bonapptit.R.id.breakfast_button;

public class SecondActivity extends AppCompatActivity {

    ImageButton breakfast_btn;
    ImageButton lunch_btn;
    ImageButton dinner_btn;
    Button back_btn;
    Bundle bundle;
    Intent oldIntent;
    Intent newIntent;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        oldIntent = getIntent();
        bundle = oldIntent.getBundleExtra("bundle");
        breakfast_btn = (ImageButton) findViewById(R.id.breakfast_button);
        breakfast_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                newIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                bundle.putInt("menuType", Keys.MENU_BREAKFAST);
                newIntent.putExtra("bundle", bundle);
                startActivity(newIntent);
            }
        });

        lunch_btn = (ImageButton) findViewById(R.id.lunch_button);
        lunch_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                bundle.putInt("menuType", Keys.MENU_LUNCH);
                newIntent.putExtra("bundle", bundle);
                startActivity(newIntent);
            }
        });
        dinner_btn = (ImageButton) findViewById(R.id.dinner_button);
        dinner_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                bundle.putInt("menuType", Keys.MENU_DINNER);
                newIntent.putExtra("bundle", bundle);
                startActivity(newIntent);
            }
        });

//        back_btn = (Button) findViewById(R.id.back_button);
//        back_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                newIntent = new Intent(SecondActivity.this, MainActivity.class);
//                startActivity(newIntent);
//            }
//        });
    }
}
