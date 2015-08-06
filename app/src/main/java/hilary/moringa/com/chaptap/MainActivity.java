package hilary.moringa.com.chaptap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListView();

    }

    private void populateListView() {
        //Create List of items
        String[] myHotels = {"BrewBistro", "VilaRosa Kempinsky", "Mama Oliech", "Sarova Stanley", "Hilton"};

        //Build Adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,                   //Context for the activity
                R.layout.da_item,       //layout to be created or displayed
                myHotels);              //The hotels to be displayed

        //Configure the List View

        ListView list = (ListView) findViewById(R.id.listView2);
        list.setAdapter(adapter);
    }

}
