package com.example.samplepassingdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import api_classes.RequestBookDetails;

public class NewRequestActivity extends Activity implements OnClickListener {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_request);
		
		Button b1 = (Button) findViewById(R.id.button1); 
		
		b1.setOnClickListener(this); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_request, menu);
		return true;
	}

	@Override
	public void onClick(View v) { 
		switch(v.getId()){
		case R.id.button1:
			Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
			EditText nameText = (EditText) findViewById(R.id.editText1);
			RequestBookDetails.name = nameText.getText().toString();
			Intent refresh = new Intent(this, MainActivity.class);
			startActivity(refresh);
			this.finish();
			break;   
		}
		
	}

}
