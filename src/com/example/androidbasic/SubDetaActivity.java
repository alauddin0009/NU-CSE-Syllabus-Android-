package com.example.androidbasic;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SubDetaActivity extends Activity {
	TextView txtview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub_deta);
		
		Intent in = getIntent();
		String position = in.getExtras().getString("id");
		//int id=Integer.parseInt(position);
		
		txtview= (TextView) findViewById(R.id.textSubDet);
		txtview.setText(Html.fromHtml(getDataFromAssetFolder(position+".txt")));

	}
	//read txt file
	public String getDataFromAssetFolder(String paramString) {
		try {
			InputStream localInputStream = getAssets().open(paramString);
			byte[] arrayOfByte = new byte[localInputStream.available()];
			localInputStream.read(arrayOfByte);
			localInputStream.close();
			String str = new String(arrayOfByte);
			return str;
			} catch (IOException localIOException) {
				throw new RuntimeException(localIOException);
				}
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
        if (id == R.id.action_about) {
        	Intent aboutActivity = new Intent(this, AboutActivity.class);
			startActivity(aboutActivity);
            return true;
        }else if (id == R.id.action_exit) {
        	Intent intent = new Intent(this, CloseActivity.class);
        	//Clear all activities and start new task
        	intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK); 
        	startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
