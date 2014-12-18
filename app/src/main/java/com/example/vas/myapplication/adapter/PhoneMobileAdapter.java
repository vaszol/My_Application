package com.example.vas.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.vas.myapplication.R;
import com.example.vas.myapplication.pojo.PhoneMobile;

import java.util.List;

/**
 * Created by vas on 17-Dec-14.
 */
public class PhoneMobileAdapter extends BaseAdapter{

    private List<PhoneMobile> list;
    private LayoutInflater layoutInflater;

    public PhoneMobileAdapter(Context context, List<PhoneMobile> list) {
        this.list = list;
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view==null){
            view = layoutInflater.inflate(R.layout.item_layout,parent,false);
        }

        PhoneMobile phoneMobile = getPhoneMobile(position);

        TextView textView=(TextView)view.findViewById(R.id.textView);
        textView.setText(phoneMobile.getName());
        return view;
    }
    private PhoneMobile getPhoneMobile(int position){
        return  (PhoneMobile)getItem(position);
    }
}
