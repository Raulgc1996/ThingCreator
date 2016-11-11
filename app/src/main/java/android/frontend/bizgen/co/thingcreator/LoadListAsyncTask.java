package android.frontend.bizgen.co.thingcreator;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;

/**
 * Created by Raúl on 28/10/2016.
 */
public class LoadListAsyncTask extends AsyncTask<String,String,Void> {

    private MainActivity mainActivity;

    public LoadListAsyncTask(MainActivity mainActivity) {
        attach(mainActivity);
    }

    public void attach(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void detach() {
        this.mainActivity = null;
    }

    @Override
    protected Void doInBackground(String... strings) {
        WebRequest webRequest = new WebRequest();
        try {
            if (webRequest.get("http://bizgen.co/web/admin/api/idea")) {

                Log.d("RAul", "OK Total: " + webRequest.getResponseString());
            } else {
                Log.d("RAul", "Error: " + webRequest.getExceptionMessage());
            }

            JSONArray jsonResponse = new JSONArray(webRequest.getResponseString());
            //JSONArray books = jsonResponse.getJSONArray("idea");

            for (int i = 0; i < jsonResponse.length(); i++) {
                Log.d("RAul", jsonResponse.getJSONObject(i).getString("name"));
                mainActivity.things.add(new Thing(jsonResponse.getJSONObject(i).getString("name"),jsonResponse.getJSONObject(i).getString("description"),jsonResponse.getJSONObject(i).getInt("id"),jsonResponse.getJSONObject(i).getInt("latitude"),jsonResponse.getJSONObject(i).getInt("longitude"),0,R.drawable.bizgen));
            }
        } catch (Exception e) {
            Log.d("RAul",e.getMessage());
        }
        return null;
    }

}
