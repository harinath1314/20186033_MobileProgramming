package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;

public class startpage extends AppCompatActivity{
    private static final String TAG = "here is the error";
    public static JSONArray data;
    TextView productid;
    String product;
    String productdesc;
    TextView productdescription;
    String dat = "";
    JSONArray JA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        productid = (TextView) findViewById(R.id.productid);

//        productdescription = (TextView) findViewById(R.id.description);
//        JSONObject jsonObjectArray = data.get(0);
        super.onCreate(savedInstanceState);

//
        Intent i = getIntent();
        Bundle b = i.getExtras();
        if (b!=null) {
            this.dat = (String) b.get("jsondata");
//            Log.d(TAG, "onCreate: "+dat);


            try {
                JSONObject JO = new JSONObject(dat);
                 JA = JO.getJSONArray("ProductCollection");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }





        //test dhamaka
        for (int in = 0; in < this.JA.length()-2; in++){
            try {
                JSONObject productjsonobj = JA.getJSONObject(in);

                product =  (String) productjsonobj.get("ProductId");
                Log.e(TAG, "onCreate: " + productjsonobj );
                Log.e(TAG, "onCreate: -------->"+product );


//                productid.append(product+"\n\n\n");
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        setContentView(R.layout.activity_startpage);




    }
}
