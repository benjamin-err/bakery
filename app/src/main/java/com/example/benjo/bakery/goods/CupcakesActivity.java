package com.example.benjo.bakery.goods;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.benjo.bakery.BakeryApplication;
import com.example.benjo.bakery.startend.EndPageActivity;
import com.example.benjo.bakery.R;

public class CupcakesActivity extends AppCompatActivity {

    private static final Integer price1 = 2;
    private static final Integer price2 = 4;
    private static final Integer price3 = 6;
    private static final Integer price4 = 8;
    private static final Integer price5 = 10;
    private static final Integer price6 = 12;

    Integer overallPrice = BakeryApplication.getPrice();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cupcakes_activity);

        findViewById(R.id.imageButton7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BakeryApplication.add(price1);
                startActivity(new Intent(CupcakesActivity.this, EndPageActivity.class));
            }
        });

        findViewById(R.id.imageButton8).setOnClickListener(v -> {
                BakeryApplication.add(price2);
                startActivity(new Intent(CupcakesActivity.this, EndPageActivity.class));
        });

       findViewById(R.id.imageButton9).setOnClickListener(v -> {
                BakeryApplication.add(price3);
                startActivity(new Intent(CupcakesActivity.this, EndPageActivity.class));
        });

        findViewById(R.id.imageButton10).setOnClickListener(v -> {
                BakeryApplication.add(price4);
                startActivity(new Intent(CupcakesActivity.this, EndPageActivity.class));
        });

        findViewById(R.id.imageButton11).setOnClickListener(v -> {
                BakeryApplication.add(price5);
                startActivity(new Intent(CupcakesActivity.this, EndPageActivity.class));
        });

        findViewById(R.id.imageButton12).setOnClickListener(v -> {
                BakeryApplication.add(price6);
                startActivity(new Intent(CupcakesActivity.this, EndPageActivity.class));
        });
    }
}
