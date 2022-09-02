package com.example.benjo.bakery.startend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.benjo.bakery.BakeryApplication;
import com.example.benjo.bakery.R;
import com.example.benjo.bakery.goods.CupcakesActivity;
import com.example.benjo.bakery.goods.MilkshakesActivity;

public class StartScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.start_screen_activity);

        findViewById(R.id.buttonCupcakes).setOnClickListener(v-> {
            startActivity(new Intent(StartScreenActivity.this, CupcakesActivity.class));
        });


        findViewById(R.id.buttonMilkshakes).setOnClickListener(v -> {
                startActivity(new Intent(StartScreenActivity.this, MilkshakesActivity.class));
        });
    }

}