package com.example.micha_000.ustapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.micha_000.ustapp.R;

public class buildingList extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_list);
        String[] buildings={"Roque Ruaño", "UST Main Building", "Beato Angelico"};
        ListAdapter buildingLists = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, buildings);
        ListView displayView = (ListView) findViewById(R.id.buildingView);
        displayView.setAdapter(buildingLists);
        displayView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String choice=String.valueOf(parent.getItemAtPosition(position));
                if (choice=="Roque Ruaño") {
                    Intent intent = new Intent(getApplicationContext(), roqueBuilding.class);
                    startActivity(intent);
                }

                else if (choice=="UST Main Building") {
                    Intent intent = new Intent(getApplicationContext(), mainBuilding.class);
                    startActivity(intent);
                }

                else if (choice=="Beato Angelico") {
                    Intent intent = new Intent(getApplication(), beatoAngelico.class);
                    startActivity(intent);
                }

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.building_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
