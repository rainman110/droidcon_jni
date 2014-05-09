package de.dlr.droidcontutorial;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

@SuppressWarnings("unused")
public class DroidconActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_droidcon);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.droidcon, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void calcFiboClicked(View view) {
		TextView tv = (TextView) findViewById(R.id.label1);
		EditText edit = (EditText) findViewById(R.id.editNumber);
		int n = Integer.parseInt(edit.getText().toString());
		tv.setText("calc_fibonacci clicked");
		
		// call native fibonacci code and set result to tv
		int result = DroidconNative.calcFibonacci(n);
		tv.setText(Integer.valueOf(result).toString());
	}
	
	public void getNameClicked(View view) {
		TextView tv = (TextView) findViewById(R.id.label1);
		tv.setText("get_name clicked");
		
		// get name from droidcon-native
		String name = DroidconNative.getName();
		tv.setText(name);
	}
	
	public void setNameClicked(View view) {
		TextView tv = (TextView) findViewById(R.id.label1);
		CharSequence text = ((TextView) findViewById(R.id.editText1)).getText();
		tv.setText("set_name clicked");
		
		// set name to droidcon-native
		DroidconNative.setName(text.toString());
	}
	
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_droidcon,
					container, false);
			return rootView;
		}
	}

}
