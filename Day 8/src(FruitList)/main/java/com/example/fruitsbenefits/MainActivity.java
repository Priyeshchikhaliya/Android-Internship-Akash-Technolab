package com.example.fruitsbenefits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String [] fruitsNameIndex;
    private int fruits_image[] = {R.drawable.apple_icon, R.drawable.banana_icon, R.drawable.grape_icon,R.drawable.orange_icon, R.drawable.watermelon_icon, R.drawable.papaya_icon, R.drawable.blackberry_icon, R.drawable.strawberry_icon, R.drawable.mango_icon, R.drawable.lichi_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.indexListId);
        fruitsNameIndex = getResources().getStringArray(R.array.fruitsIndexList);

        final String [] fruitDetails = getResources().getStringArray(R.array.fruitsDetailsArray);

        //Here goes custom adapter code to show fruits image, text and short description in list view.

        CustomAdapter adapter = new CustomAdapter(this,fruitsNameIndex, fruits_image);
        listView.setAdapter(adapter);

        //Here goes item click listener for list view.

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String fruitsName = fruitDetails [position];
                String fruitsHeading = fruitsNameIndex [position];
                int fruitsHeadingImage = fruits_image [position];

                Intent intent = new Intent(MainActivity.this, FruitDetailswithPhotos.class);
                intent.putExtra("fruits", fruitsName);
                intent.putExtra("fruitsImage", fruitsHeadingImage);
                intent.putExtra("fruitsDetailsHeading", fruitsHeading);
                startActivity(intent);
            }
        });

    }
}