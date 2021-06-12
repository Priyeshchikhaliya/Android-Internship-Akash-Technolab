package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] states = {"GJ-01 Ahmedabad",
                "GJ-02 Mehsana",
                "GJ-03 Rajkot",
                "GJ-04 Bhavnagar",
                "GJ-05 Surat City",
                "GJ-06 Vadodara City",
                "GJ-07 Kheda (Nadiad)",
                "GJ-08 Banaskantha (Palanpur)",
                "GJ-09 Sabarkantha (Himmatnagar)",
                "GJ-10 JAMNAGAR",
                "GJ-11 Junagadh",
                "GJ-12 Kutch",
                "GJ-13 Surendranagar",
                "GJ-14 Amreli",
                "GJ-15 Valsad",
                "GJ-16 Bharuch",
                "GJ-17 Panchmahal (Godhara)",
                "GJ-18 Gandhinagar",
                "GJ-19 Bardoli, District Surat",
                "GJ-20 Dahod",
                "GJ-21 Navsari",
                "GJ-22 Narmada",
                "GJ-23 Anand",
                "GJ-24 Patan",
                "GJ-25 Porbandar (Sudamapuri)",
                "GJ-26 Vyara",
                "GJ-27 Ahmedabad East (Vastral)",
                "GJ-28 Surat West",
                "GJ-29 Vadodara rural",
                "GJ-30 Dang",
                "GJ-31 Aravalli- (Modasa)",
                "GJ-32 Gir Somnath – Veraval",
                "GJ-33 Botad",
                "GJ-34 Chhota Udaipur",
                "GJ-35 Mahisagar - Lunavada",
                "GJ-36 Morbi",
                "GJ-37 Khambhalia (Devbhumi Dwarka)",
                "GJ-38 Bavla",
               };

        final ArrayList arrayList = new ArrayList(Arrays.asList(states));
        final ListView listView = (ListView)findViewById(R.id.userlist);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"State Name : " + arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
