package android.frontend.bizgen.co.thingcreator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
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
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setTitle("Menu");
        things = new ArrayList<Thing>();
        things.add(new Thing("idea1","klkldkglkfdhjmlglhfdkjbndfklnbkdgjnb",1,1,1,1));
        ThingAdapter tA = new ThingAdapter(things,this);
        listviewThing = (ListView) findViewById(R.id.listView);
        listviewThing.setAdapter(tA);
        }

    }

