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

public class AboutActivity extends Activity {
	TextView txtview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		
		txtview= (TextView) findViewById(R.id.aboutMe);
		txtview.setText(Html.fromHtml(getDataFromAssetFolder("aboutMe.txt")));
	}
	
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
        	finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
