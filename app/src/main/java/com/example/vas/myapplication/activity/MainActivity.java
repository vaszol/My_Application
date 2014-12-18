package com.example.vas.myapplication.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.vas.myapplication.R;
import com.example.vas.myapplication.adapter.PhoneMobileAdapter;
import com.example.vas.myapplication.pojo.PhoneMobile;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);

//        List<String> items = initData();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        PhoneMobileAdapter adapter = new PhoneMobileAdapter(this, initData());
        listView.setAdapter(adapter);
    }

    private List<PhoneMobile> initData(){
        List<PhoneMobile> list = new ArrayList<>();
        list.add(new PhoneMobile(1, "iphone", 1000));
        list.add(new PhoneMobile(2,"HTC",4546));
        list.add(new PhoneMobile(3,"Samsung",888));
        list.add(new PhoneMobile(4,"LG",700));

        return list;
    }

}
