package com.example.samplepassingdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import api_classes.RequestBookDetails;

public class MainActivity extends Activity implements OnClickListener {
//	RequestBookDetails requestBookDetails = new RequestBookDetails();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 
		
		Button b1 = (Button) findViewById(R.id.button1); 
		Button b2 = (Button) findViewById(R.id.button2); 
		
		b1.setOnClickListener(this); 
		b2.setOnClickListener(this); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) { 
		
		switch(v.getId()){
		case R.id.button1: 
			String sample =  RequestBookDetails.name;
			Toast.makeText(getApplicationContext(), sample, Toast.LENGTH_SHORT).show();
			break;  
		case R.id.button2:
			Intent i = new Intent(this, NewRequestActivity.class);
			startActivity(i); 
			break;
		}
		
	}

 
	 

}
