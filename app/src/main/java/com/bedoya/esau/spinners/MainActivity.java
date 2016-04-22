package com.bedoya.esau.spinners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] nombres=new String[]{"Superman", "Flash", "Mujer Maravilla"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombres);
        listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
