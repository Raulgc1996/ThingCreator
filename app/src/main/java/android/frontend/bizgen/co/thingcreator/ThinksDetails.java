package android.frontend.bizgen.co.thingcreator;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Raúl on 19/10/2016.
 */
public class ThinksDetails extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_of_the_think);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setTitle("Detail Activity");
        TextView nom = (TextView) findViewById(R.id.textViewnom);
        TextView des = (TextView) findViewById(R.id.textView3);
        ImageView photo = (ImageView) findViewById(R.id.imageView2);

        String n = (String) getIntent().getExtras().getSerializable("nom");
        nom.setText(n);
        String d = (String) getIntent().getExtras().getSerializable("desc");
        des.setText(d);
        int i = (int) getIntent().getExtras().getSerializable("foto");
        photo.setImageResource(i);
    }
    private void setupActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDefaultDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("details");
        }
    }

}
