package com.example.samplemenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.activity_main, menu);
    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
    	case R.id.menu1:
    		Toast.makeText(this, "it's menu1.", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.menu2:
    		Toast.makeText(this, R.string.menu2, Toast.LENGTH_LONG).show();
    		break;
    	default:
    		break;
    	}
    	return true;
    }    
}
