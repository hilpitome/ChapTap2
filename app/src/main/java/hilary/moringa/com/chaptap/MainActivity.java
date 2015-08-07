package hilary.moringa.com.chaptap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public class MainActivity extends AppCompatActivity {

    public static GoogleAnalytics analytics;
    public static Tracker tracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListView();
        clickCallBack();

        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(1800);

        tracker = analytics.newTracker("UA-65065175-2"); // Replace with actual tracker/property Id
        tracker.enableExceptionReporting(true);
        tracker.enableAdvertisingIdCollection(true);
        tracker.enableAutoActivityTracking(true);

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

    private void clickCallBack() {
        ListView list = (ListView) findViewById(R.id.listView2);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;

                //linking the list view to a new activity
                if (position == 0) {
                    Intent myIntent = new Intent(getApplicationContext(), Servic_Activity.class);
                    startActivity(myIntent);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(getApplicationContext(), Servic_Activity.class);
                    startActivity(myIntent);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(getApplicationContext(), Servic_Activity.class);
                    startActivity(myIntent);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(getApplicationContext(), Servic_Activity.class);
                    startActivity(myIntent);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(getApplicationContext(), Servic_Activity.class);
                    startActivity(myIntent);
                }

            }
        });
    }



}
