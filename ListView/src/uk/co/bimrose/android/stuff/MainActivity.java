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
	//YippeKiaYay
	private int switcher;
	private TextView selection;
	private static final String[] items = {"Mons the Boss", "Bim", "Monster4", "Kurg", "Mia", "Gran", "Gramps", "Soph", "Buzz", "Will", "Gill", "Izac", "Sally", "The girls"};
	
	//More crap
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		selection = (TextView)findViewById(R.id.selection);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
	}
	
	//Yet more crap
	@Override
	public void onListItemClick(ListView parent, View v, int position, long id){
		switcher++;
		String holder = "";
		if(switcher%2 == 0){
			holder = " Trundles down the line!!!";
		}else{
			holder = " Let's just say he's square!";
		}
		selection.setText(items[position]+holder);
	}
	
	//probably the last bit of crap, for now at least
}
//Wonder what problems this will cause???????????