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

	private static final String[] items = {"KurganIsTheBoss", "Bim", "Monster4", "Kurg", "Mia", "Gran", "Gramps", "Soph", "Buzz", "Will", "Gill", "Izac", "Sally", "The girls"};

	
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
		if(switcher%4 == 0){
			holder = " Trundles down the line!!!";
		}else if(switcher%3 == 1){
			holder = " Let's just say he's square!";
		}if(switcher%3 == 2){
			holder = " He's the cheeky one!!!!!";
		}if(switcher%3 == 3){
			holder = " Is always on time";
		}
		selection.setText(items[position]+holder);

	}

	
	//probably the last bit of crap, for now at least
}
//Wonder what problems this will cause???????????
//none in the end, conflict was resolved by hand!
//this might break something though....
