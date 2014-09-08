package com.example.micha_000.ustapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;




public class homePage extends ActionBarActivity {

    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        courseListener();
        buildingListener();
    }

    public void courseListener() {
        imgButton = (ImageButton) findViewById(R.id.courseButton);
        imgButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), courseList.class);
                startActivity(intent);
            }
        });
    }

   public void buildingListener() {
       imgButton = (ImageButton) findViewById(R.id.buildingButton);
       imgButton.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), buildingList.class);
               startActivity(intent);
           }
       });
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_page, menu);
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
