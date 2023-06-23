package com.kashtbhanjan.hanumanuniverse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TempleAdapter extends BaseAdapter {


    Context context;
    String templename[];
    int templeImage[];
    LayoutInflater inflater;

    public  TempleAdapter(Context ctx , String[] templename , int[] templeImage){
        this.context = ctx;
        this.templename = templename;
        this.templeImage = templeImage;
        inflater = LayoutInflater.from(ctx);
    }


    @Override
    public int getCount() {
        return templename.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        convertView = inflater.inflate(R.layout.temple_item,null);
        TextView textView = (TextView) convertView.findViewById(R.id.templename);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.templepic);
        textView.setText(templename[i]);
        imageView.setImageResource(templeImage[i]);
        return convertView;
    }
}
