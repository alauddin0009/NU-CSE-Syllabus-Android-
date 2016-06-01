package com.example.androidbasic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class SemesContActivity extends Activity {
	TextView txtview;
	String[] semster_0 = {"CSE-111 Introduction to Computer System", "CSE-112 Programming Language", "CSE-113 Programming Language Practical", "CSE-114 Physics(Electricity and Magnetism", "CSE-115 Differential Calculus and Co-Ordinate Geometry", "GED-116 English"};
	String[] semster_1 = {"CSE-121 Data Structure", "CSE-122 Data Structure Practical", "CSE-123 Introduction to Electrical Engineering", "CSE-124 Introduction to Electrical Engineering Practical", "CSE-125 Intergal Calculus and Differential Equation", "CSE-126 Statistic", "CSE-127 Discrete Mathematics"};
	String[] semster_2 = {"CSE-211 Object Oriented Programming","CSE-212 OO Programming Language Practical","CSE-213 Operating System",	"CSE-214 Digital Logic Design","CSE-215 Digital Logic Design Practical","CSE-216 Mathematics for CSE","CSE-217 Electronic Devices and Circuits","CSE-218 Electronic Devices and Circuits Practical","GED-219 Basic Accounting"};
	String[] semster_3 = {"CSE-221 Algorithm Design","CSE-222 Algorithm Design Practical","CSE-223 Database Management System","CSE-224 Database Management System Practical","CSE-225 Computer Organization and Architecture","CSE-226 Data Communications",	"GED-227 Economics"};
	String[] semster_4 = {"CSE-311 Theory of Computation","CSE-312 Microprocessor and Assembly Language",	"CSE-313 Assembly Language Practical","CSE-314 Engineering  Mathematics", "GED-315 Sociology","GED-316 Technical Writing & Communications"};
	String[] semster_5 ={"CSE-321 Software Engineering","CSE-322 Software Engineering Practical","CSE-323 Numerical Analysis","CSE-324 Computer Graphics & Multimedia","CSE-325 Computer Graphics and Multimedia Practical","CSE-326 Compiler Design","CSE-327 Compiler Design Practical","CSE-328 System Analysis and Design"};
	String[] semster_6 ={"CSE-411 Computer Networking",	"CSE-412 Computer Networking Practical","CSE-413 Artificial Intelligence and Neural Network","CSE-414 Parallel and Distributed Processing",	"CSE-415 Peripheral and Interfacing","CSE-416 Peripheral and Interfacing Practical","CSE-417 Digital Signal Processing"};
	String[] semster_7 ={"CSE-421 Web Engineering","CSE-422 Web Engineering Practical","CSE-423 Computer and Network Security","CSE-42X Elective Course","CSE-499 *Project","CSE 424 Image Processing","CSE 425 VLSI Design","CSE 426 Simulation and Modeling","CSE 427 E-Commerce"};
			
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_semes_cont);
		
		Intent in = getIntent();
		String position = in.getExtras().getString("id");
		int id=Integer.parseInt(position);
		switch(id){
		case 0: ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, semster_0);
        		ListView listView = (ListView) findViewById(R.id.semester_subject);
        		listView.setAdapter(adapter);
        		listView.setOnItemClickListener(new OnItemClickListener() {
              	  @Override
              	  public void onItemClick(AdapterView<?> parent, View view,
              	    int position, long id) {
              	    Intent i = new Intent(getApplicationContext(), SubDetaActivity.class);
              		//pass image index
              	    String pos=Integer.toString(position);
              	    pos="0"+pos;
              		i.putExtra("id", pos);
              		startActivity(i);

              	  }

              	}); 
        		break;
		case 1: ArrayAdapter adapter1 = new ArrayAdapter<String>(this, R.layout.activity_listview, semster_1);
				ListView listView1 = (ListView) findViewById(R.id.semester_subject);
				listView1.setAdapter(adapter1);
				listView1.setOnItemClickListener(new OnItemClickListener() {
		      	  @Override
		      	  public void onItemClick(AdapterView<?> parent, View view,
		      	    int position, long id) {
		      	    Intent i = new Intent(getApplicationContext(), SubDetaActivity.class);
		      		//pass image index
		      	    String pos=Integer.toString(position);
		      	    pos="1"+pos;
		      		i.putExtra("id", pos);
		      		startActivity(i);
		
		      	  }
		
		      	}); 
			break;
		case 2: ArrayAdapter adapter2 = new ArrayAdapter<String>(this, R.layout.activity_listview, semster_2);
				ListView listView2 = (ListView) findViewById(R.id.semester_subject);
				listView2.setAdapter(adapter2);
				listView2.setOnItemClickListener(new OnItemClickListener() {
		      	  @Override
		      	  public void onItemClick(AdapterView<?> parent, View view,
		      	    int position, long id) {
		      	    Intent i = new Intent(getApplicationContext(), SubDetaActivity.class);
		      		//pass image index
		      	    String pos=Integer.toString(position);
		      	    pos="2"+pos;
		      		i.putExtra("id", pos);
		      		startActivity(i);
		
		      	  }
		
		      	}); 
			break;
		case 3: ArrayAdapter adapter3 = new ArrayAdapter<String>(this, R.layout.activity_listview, semster_3);
				ListView listView3 = (ListView) findViewById(R.id.semester_subject);
				listView3.setAdapter(adapter3);
				listView3.setOnItemClickListener(new OnItemClickListener() {
		      	  @Override
		      	  public void onItemClick(AdapterView<?> parent, View view,
		      	    int position, long id) {
		      	    Intent i = new Intent(getApplicationContext(), SubDetaActivity.class);
		      		//pass image index
		      	    String pos=Integer.toString(position);
		      	    pos="3"+pos;
		      		i.putExtra("id", pos);
		      		startActivity(i);
		
		      	  }
		
		      	}); 
			break;
		case 4: ArrayAdapter adapter4 = new ArrayAdapter<String>(this, R.layout.activity_listview, semster_4);
				ListView listView4 = (ListView) findViewById(R.id.semester_subject);
				listView4.setAdapter(adapter4);
				listView4.setOnItemClickListener(new OnItemClickListener() {
		      	  @Override
		      	  public void onItemClick(AdapterView<?> parent, View view,
		      	    int position, long id) {
		      	    Intent i = new Intent(getApplicationContext(), SubDetaActivity.class);
		      		//pass image index
		      	    String pos=Integer.toString(position);
		      	    pos="4"+pos;
		      		i.putExtra("id", pos);
		      		startActivity(i);
		
		      	  }
		
		      	}); 
			break;
		case 5: ArrayAdapter adapter5 = new ArrayAdapter<String>(this, R.layout.activity_listview, semster_5);
				ListView listView5 = (ListView) findViewById(R.id.semester_subject);
				listView5.setAdapter(adapter5);
				listView5.setOnItemClickListener(new OnItemClickListener() {
		      	  @Override
		      	  public void onItemClick(AdapterView<?> parent, View view,
		      	    int position, long id) {
		      	    Intent i = new Intent(getApplicationContext(), SubDetaActivity.class);
		      		//pass image index
		      	    String pos=Integer.toString(position);
		      	    pos="5"+pos;
		      		i.putExtra("id", pos);
		      		startActivity(i);
		
		      	  }
		
		      	}); 
			break;
		case 6: ArrayAdapter adapter6 = new ArrayAdapter<String>(this, R.layout.activity_listview, semster_6);
				ListView listView6 = (ListView) findViewById(R.id.semester_subject);
				listView6.setAdapter(adapter6);
				listView6.setOnItemClickListener(new OnItemClickListener() {
		      	  @Override
		      	  public void onItemClick(AdapterView<?> parent, View view,
		      	    int position, long id) {
		      	    Intent i = new Intent(getApplicationContext(), SubDetaActivity.class);
		      		//pass image index
		      	    String pos=Integer.toString(position);
		      	    pos="6"+pos;
		      		i.putExtra("id", pos);
		      		startActivity(i);
		
		      	  }
		
		      	}); 
			break;
		case 7: ArrayAdapter adapter7 = new ArrayAdapter<String>(this, R.layout.activity_listview, semster_7);
				ListView listView7 = (ListView) findViewById(R.id.semester_subject);
				listView7.setAdapter(adapter7);
				listView7.setOnItemClickListener(new OnItemClickListener() {
		      	  @Override
		      	  public void onItemClick(AdapterView<?> parent, View view,
		      	    int position, long id) {
		      	    Intent i = new Intent(getApplicationContext(), SubDetaActivity.class);
		      		//pass image index
		      	    String pos=Integer.toString(position);
		      	    pos="7"+pos;
		      		i.putExtra("id", pos);
		      		startActivity(i);
		
		      	  }
		
		      	}); 
			break;
		default:
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
