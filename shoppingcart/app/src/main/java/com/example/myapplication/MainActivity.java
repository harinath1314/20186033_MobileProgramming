package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    ImageView openimage;
    TextView  starttext;
    TextView starting;
    public static String jsonArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openimage = (ImageView) findViewById(R.id.imageView);
        starttext  = (TextView) findViewById(R.id.starttext);
        starting = (TextView) findViewById(R.id.start);
        fetchdata process =new fetchdata();
        process.execute();
        openimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(MainActivity.this, startpage.class);
                    intent.putExtra("jsondata", jsonArray);
                    startActivity(intent);


            }
        });
    }

}
