package com.example.benjo.bakery.startend;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.benjo.bakery.BakeryApplication;
import com.example.benjo.bakery.R;

public class EndPageActivity extends AppCompatActivity {
    Integer price = BakeryApplication.getPrice();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.end_page_activity);

        TextView priceTextView=(TextView) findViewById(R.id.priceTextView);
        priceTextView.setText(price.toString());

        findViewById(R.id.reorderButton).setOnClickListener(v -> {
                //price = 0;
                BakeryApplication.setPrice(price);
                //priceOverview.setText(String.valueOf(BackeryApplication.getPrice()));
                startActivity(new Intent(EndPageActivity.this, StartScreenActivity.class));
        });

        findViewById(R.id.cancleButton).setOnClickListener(v -> {
            BakeryApplication.setPrice(0);
            startActivity(new Intent(EndPageActivity.this, StartScreenActivity.class));
        });
    }

    // open button
    public void open(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.com/signin?country.x=BA&locale.x=en_BA"));
        startActivity(browserIntent);
    }
}

