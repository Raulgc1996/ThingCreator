package android.frontend.bizgen.co.thingcreator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Raúl on 13/10/2016.
 */
public class MainActivity extends AppCompatActivity
{
    private ListView listviewThing;
    private ArrayList<Thing>things;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setTitle("Menu");
        things = new ArrayList<Thing>();
        things.add(new Thing("idea1","klkldkglkfdhjmlglhfdkjbndfklnbkdgjnb",1,1,1,1,R.drawable.bizgen));
        ThingAdapter tA = new ThingAdapter(things,this);
        listviewThing = (ListView) findViewById(R.id.listView);
        listviewThing.setAdapter(tA);

        listviewThing.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ThinksDetails.class);
                intent.putExtra("nom", things.get(i).getName());
                intent.putExtra("desc", things.get(i).getDescription());
                intent.putExtra("foto", things.get(i).getImage());
                startActivity(intent);

            }
        });


        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_star:
                intent = new Intent(MainActivity.this, Setting.class);
                startActivity(intent);
                return true;
            case R.id.action_settings:
               intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                return true;
          /*  case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;*/
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
    }

