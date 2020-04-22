package com.example.ppbprojectakhir.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ppbprojectakhir.R;
import com.example.ppbprojectakhir.model.Item2;

import java.util.ArrayList;

public class CustomListAdapter2 extends BaseAdapter {
    private Context context;
    private ArrayList<Item2> items;
    public CustomListAdapter2(Context context, ArrayList<Item2> items){
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
            convertView=LayoutInflater.from(context).inflate(R.layout.row2,parent,false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Item2 currentItem = (Item2) getItem(position);
        viewHolder.nomer.setText(currentItem.getNomer());
        viewHolder.itemName.setText(currentItem.getItemName());
        viewHolder.itemDescription.setText(currentItem.getItemDescription());

        return convertView;
    }
    private class ViewHolder{
        TextView nomer;
        TextView itemName;
        TextView itemDescription;
        public ViewHolder(View view){
            nomer = (TextView) view.findViewById(R.id.textView1);
            itemName = (TextView) view.findViewById(R.id.textView2);
            itemDescription = (TextView) view.findViewById(R.id.textView3);
        }
    }
}
