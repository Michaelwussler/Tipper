package mp.tipper;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class EMTIPPERActivity extends ListActivity {


	
	static final String[] COUNTRIES = new String[] {    "Gesamt", "Gruppe A", "Gruppe B", "Gruppe C", "Gruppe D", "Viertelfinale" , "Halbfinale", "Finale"};	
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{  
		 
		setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item , COUNTRIES));
		ListView lv = getListView();
		lv.setTextFilterEnabled(true);
		lv.setOnItemClickListener(new OnItemClickListener() 
		{    public void onItemClick(AdapterView<?> parent, View view,int position, long id) 
		{      // When clicked, show a toast with the TextView text   
			Toast.makeText(getApplicationContext(), ((TextView) view).getText(),          Toast.LENGTH_SHORT).show();    
			}  
		});
		super.onCreate(savedInstanceState); 	
	}

	
		}
	
