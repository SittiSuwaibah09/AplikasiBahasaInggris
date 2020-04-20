package com.example.ppbprojectakhir.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ppbprojectakhir.R;
import com.example.ppbprojectakhir.model.Item;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item> items;
    public CustomListAdapter(Context context, ArrayList<Item> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView=LayoutInflater.from(context).inflate(R.layout.row,parent,false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Item currentItem = (Item) getItem(position);
        viewHolder.itemName.setText(currentItem.getItemName());
        viewHolder.itemDescription.setText(currentItem.getItemDescription());
        viewHolder.images.setImageResource(currentItem.getImg());

        return convertView;
    }
    private class ViewHolder{
        TextView itemName;
        TextView itemDescription;
        ImageView images;
        public ViewHolder(View view){
            itemName = (TextView) view.findViewById(R.id.textView1);
            itemDescription = (TextView) view.findViewById(R.id.textView2);
            images = (ImageView) view.findViewById(R.id.image);
        }
    }
}
