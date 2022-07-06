package com.example.listview;

import static com.example.listview.R.drawable.avatar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ItemModel> list;
    private int layout;
    private Context mContext;


    public ListViewAdapter (ArrayList<ItemModel> data, int layout, Context context){
        this.list = data;
        this.layout = layout;
        this.mContext = context;

    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public ItemModel getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        ItemModel item = getItem(position);
        ImageView avatar = convertView.findViewById(R.id.imageView);
        ImageView clb = convertView.findViewById(R.id.clb);
        TextView name_ = convertView.findViewById(R.id.name);
        name_.setText(item.getName());
        TextView describe_ = convertView.findViewById(R.id.describe);
        avatar.setImageResource(item.avatar);
        clb.setImageResource(item.clbImage);
        describe_.setText(item.describe);
        return convertView;
    }
}
