package android.frontend.bizgen.co.thingcreator;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Raúl on 13/10/2016.
 */
public class ThingAdapter extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Thing> things;

    public ThingAdapter(ArrayList<Thing> things, Activity activity) {
        super();
        this.things = things;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return things.size();
    }

    @Override
    public Object getItem(int i) {
        return things.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.item_of_the_list,null);
        Thing idea = things.get(i);
        TextView name = (TextView) v.findViewById(R.id.textViewname);
        name.setText(idea.getName());
        TextView date = (TextView) v.findViewById(R.id.textViewdate);
        date.setText("ojol");
        ImageView foto = (ImageView) v.findViewById((R.id.imageViewIcon));
        foto.setImageResource(idea.getImage());
        return v;
    }
}
