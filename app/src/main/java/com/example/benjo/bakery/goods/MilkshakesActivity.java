package com.example.benjo.bakery.goods;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.benjo.bakery.BakeryApplication;
import com.example.benjo.bakery.startend.EndPageActivity;
import com.example.benjo.bakery.R;

public class MilkshakesActivity extends AppCompatActivity{

    private static final Integer price1 = 2;
    private static final Integer price2 = 4;
    private static final Integer price3 = 6;
    private static final Integer price4 = 8;
    private static final Integer price5 = 10;
    private static final Integer price6 = 12;
    //TextView priceOverview;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.milkshake_activity);

        // An ImageButton is placed over an image
        findViewById(R.id.imageButton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {;
                BakeryApplication.add(price1);
                //priceOverview.setText(String.valueOf(BackeryApplication.getPrice()));
                startActivity(new Intent(MilkshakesActivity.this, EndPageActivity.class));
            }
        });

        findViewById(R.id.imageButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BakeryApplication.add(price2);
                startActivity(new Intent(MilkshakesActivity.this, EndPageActivity.class));
            }
        });

        findViewById(R.id.imageButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BakeryApplication.add(price3);
                startActivity(new Intent(MilkshakesActivity.this, EndPageActivity.class));
            }
        });

        findViewById(R.id.imageButton4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BakeryApplication.add(price4);
                startActivity(new Intent(MilkshakesActivity.this, EndPageActivity.class));
            }
        });

        findViewById(R.id.imageButton5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BakeryApplication.add(price5);
                startActivity(new Intent(MilkshakesActivity.this, EndPageActivity.class));
            }
        });
        
       findViewById(R.id.imageButton6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BakeryApplication.add(price6);
                startActivity(new Intent(MilkshakesActivity.this, EndPageActivity.class));
            }
        });
    }
}