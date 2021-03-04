package com.pious.orphanage_app;
//CustomAdapter
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAddapter extends BaseAdapter {
    Context mContext;
    ArrayList<Person> data;//modify here

    public CustomAddapter(Context mContext, ArrayList<Person> data) {
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();// # of items in your arraylist
    }
    @Override
    public Object getItem(int position) {
        return data.get(position);// get the actual item
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //ViewHolder viewHolder;

            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.supportlayout, null);
            TextView t1_id=(TextView)convertView.findViewById(R.id.tv_id);
            TextView t2_name=(TextView)convertView.findViewById(R.id.tv_name);
            TextView t3_address=(TextView)convertView.findViewById(R.id.tv_address);
            TextView t4_item1=(TextView)convertView.findViewById(R.id.tv_item);
            TextView t5_item2=(TextView)convertView.findViewById(R.id.tv_item2);
            TextView t6_item3=(TextView)convertView.findViewById(R.id.tv_item3);

            Person person=data.get(position);
t2_name.setText(person.getName());
t3_address.setText(person.getAddress());
t4_item1.setText(person.getProgram());
t5_item2.setText(person.getEmail());


            //modify here
            // viewHolder = new ViewHolder();
//modify this block of code
            // viewHolder.tvnames = (TextView) convertView.findViewById(R.id.tv_name);
            // viewHolder.tvemail = (TextView) convertView.findViewById(R.id.tv_email);
            //viewHolder.tv_Address = (TextView) convertView.findViewById(R.id.tv_address);
            // viewHolder.tv_Program = (TextView) convertView.findViewById(R.id.tv_item);
            //viewHolder.imageView=(ImageView) convertView.findViewById(R.id.image);
//Up to here
            // convertView.setTag(viewHolder);
            // } else {
            //   viewHolder = (ViewHolder) convertView.getTag();
            // }
//MODIFY THIS BLOCK OF CODE
            //  Person person = data.get(position);//modify here
            //  viewHolder.tvnames.setText(person.getName());//modify here
            // viewHolder.tvemail.setText(person.getEmail());
            //modify here
            // viewHolder.tv_Address.setText(person.getAddress());
            //viewHolder.tv_Program.setText(person.getProgram());//modify here
            // viewHolder.imageView.setImageResource(person.getPhoto());
            // return convertView;

            // }
            // static class ViewHolder {
            // TextView tvnames;
            //TextView tvemail;
            // TextView tv_Address;
            //TextView tv_Program;//These don't have to be same names as the Id's
            //MODIFY THIS BLOCK OF CODE
//TextView textViewTitle;
            //     ImageView imageView;
            return null;


    }

    }