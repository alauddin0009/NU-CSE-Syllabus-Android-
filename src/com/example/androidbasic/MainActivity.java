package com.example.androidbasic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {
	String[] semster_array = {"CSE 1st Year 1st Semester","CSE 1st Year 2nd Semester","CSE 2nd Year 3rd Semester","CSE 2nd Year 4th Semester","CSE 3rd Year 5th Semester","CSE 3rd Year 6th Semester","CSE 4th Year 7th Semester","CSE 4th Year 8th Semester"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, semster_array);
        ListView listView = (ListView) findViewById(R.id.semester_listview);
        listView.setAdapter(adapter);
        
        
        //set action to listview
        listView.setOnItemClickListener(new OnItemClickListener() {
        	  @Override
        	  public void onItemClick(AdapterView<?> parent, View view,
        	    int position, long id) {
        	    Intent i = new Intent(getApplicationContext(), SemesContActivity.class);
        		//pass image index
        	    String pos=Integer.toString(position);
        		i.putExtra("id", pos);
        		startActivity(i);

        	  }

        	}); 


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
