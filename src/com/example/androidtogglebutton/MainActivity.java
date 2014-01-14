package com.example.androidtogglebutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.example.androidtogglebutton.SlipButton.OnChangedListener;

public class MainActivity extends Activity {
	SlipButton slipbutton = null;
	TextView txt_slip_status = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		slipbutton = (SlipButton)findViewById(R.id.slipbutton);
		txt_slip_status = (TextView)findViewById(R.id.txt_slip_status);
		slipbutton.SetOnChangedListener(new OnChangedListener() {
			@Override
			public void OnChanged(boolean CheckState) {
				txt_slip_status.setText((CheckState==true)?"¿ª":"¹Ø");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
