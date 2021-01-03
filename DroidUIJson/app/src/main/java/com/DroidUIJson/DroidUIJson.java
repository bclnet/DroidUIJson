package com.DroidUIJson;

import com.DroidUI.*;
import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class DroidUIJson extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Binding<Integer> v = new Binding<Integer>(null, (Action1<Integer>) null);

		/* Create a TextView and set its text to "Hello world" */
		TextView tv = new TextView(this);
		tv.setText("Hello World!");
		setContentView(tv);
	}
}
