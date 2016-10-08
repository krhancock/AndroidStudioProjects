package com.example.andriod.cookies;

import android.graphics.Color;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView androidCookie = (ImageView) findViewById(R.id.android_cookie_image_view);
        androidCookie.setImageResource(R.drawable.after_cookie);

        
        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView eatCookie = (TextView) findViewById(R.id.status_text_view);
        eatCookie.setText("I'm so Full!");
        eatCookie.setTextColor(Color.RED);
        eatCookie.setAllCaps(true);

        TextView eatCookietwo = (TextView) findViewById(R.id.status_text_viewtwo);
        eatCookietwo.setText("OMG, Ya'll");
    }
}