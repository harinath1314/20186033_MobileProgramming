package com.example.myapplication;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchdata extends AsyncTask<Void,Void, Void> {
    String line="";
    String data = "";
    JSONArray JA;
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("http://msitmp.herokuapp.com/getproducts/20186033");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream =   httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (line!=null){
                line = bufferedReader.readLine();
                data = data+line;
            }
//
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    @Override
    protected void onPostExecute(Void aVoid){
        super.onPostExecute(aVoid);
        MainActivity.jsonArray = data;

    }

}
