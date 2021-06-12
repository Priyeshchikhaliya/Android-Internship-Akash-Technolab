package com.example.fruitsbenefits;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitDetailswithPhotos extends AppCompatActivity {

    String details;
    String headingDetails;
    int headingImage;
    TextView textView;
    TextView fruitsHeading;
    ImageView detailsFruitsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_detailswith_photos);

//        Here goes Get Intent method calling from Main Activity for Put Extra method.

        textView = findViewById(R.id.detailsTextViewId);
        fruitsHeading = findViewById(R.id.detailsHeadingId);
        detailsFruitsImage = findViewById(R.id.detailsImageId);


        details = getIntent().getStringExtra("fruits");
        headingDetails = getIntent().getStringExtra("fruitsDetailsHeading");
        headingImage = getIntent().getIntExtra("fruitsImage",0);
        fruitsHeading.setText(headingDetails);
        detailsFruitsImage.setImageResource(headingImage);
        textView.setText(details);
    }
}
