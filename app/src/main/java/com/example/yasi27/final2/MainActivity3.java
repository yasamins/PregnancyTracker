package com.example.yasi27.final2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by yasi27 on 27.9.2016.
 */
public class MainActivity3 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }
}
