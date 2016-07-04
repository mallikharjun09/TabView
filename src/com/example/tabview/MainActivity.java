package com.example.tabview;

import com.example.tabview.FirstActivity;
import com.example.tabview.SecondActivity;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressLint("NewApi")
public class MainActivity extends TabActivity {
	TabHost tabHost;
	TabSpec spec1,spec2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tabHost=(TabHost)findViewById(android.R.id.tabhost);
		
		tabHost.setup();
		spec1=tabHost.newTabSpec("Tab 1");
		spec1.setContent(R.id.tab1);

		// Setting a label and an icon for tab1
		spec1.setIndicator("Activity One", getResources().getDrawable(R.drawable.ic_launcher));

		// Calling ActivityOne through intent 
		Intent in1=new Intent(this, FirstActivity.class);
		spec1.setContent(in1);

		// Creating tab2  
		spec2=tabHost.newTabSpec("Tab 2");
		spec2.setContent(R.id.tab2);
		   
		// Using the tab2.xml file for tab2 content
		spec2.setContent(R.id.tab2);
		// Setting a label and an icon for tab2
		spec2.setIndicator("Activity Two",getResources().getDrawable(R.drawable.ic_launcher));

		// Calling ActivityTwo through intent
		Intent in2=new Intent(this, SecondActivity.class);
		spec2.setContent(in2);

		// Adding tab1 and tab2 to the TabHost
		tabHost.addTab(spec1);
		tabHost.addTab(spec2); 
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
