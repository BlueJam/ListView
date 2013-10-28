package uk.co.bimrose.android.stuff;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
	//random stuff for the listview
	//Blah blah blah
	private TextView selection;
	private static final String[] items = {"a", "b", "f", "g", "h", "j", "l", "r", "w", "n", "m", "o", "6"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		selection = (TextView)findViewById(R.id.selection);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
	}
	
	@Override
	public void onListItemClick(ListView parent, View v, int position, long id){
		selection.setText(items[position]);
	}
	
}
