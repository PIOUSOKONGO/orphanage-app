package com.pious.orphanage_app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

import Model.Guest_item_Donated;

public class UserDBHelper extends BaseAdapter {
    Context context;
    ArrayList<Guest_item_Donated>arrayList;

    public UserDBHelper(Context context,ArrayList<Guest_item_Donated>arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    @Override
    public long getItemId(int position){
        return  position;
    }
    @Override
    public Object getItem(int position){
        return arrayList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.supportlayout,null);

            TextView t1_id=(TextView)convertView.findViewById(R.id.tv_id);
            TextView t2_name=(TextView)convertView.findViewById(R.id.ed_gname);
            TextView t3_address=(TextView)convertView.findViewById(R.id.ed_gaddress);
            TextView t4_item1=(TextView)convertView.findViewById(R.id.tv_item);
            TextView t5_item2=(TextView)convertView.findViewById(R.id.tv_item2);
            TextView t6_item3=(TextView)convertView.findViewById(R.id.tv_item3);

            Guest_item_Donated guest_item_donated=arrayList.get(position);

            t1_id.setText(guest_item_donated.getId());
            t2_name.setText(guest_item_donated.getGuest_Name());
            t3_address.setText(guest_item_donated.getGuest_Address());
            t4_item1.setText(guest_item_donated.getItemOne());
            t5_item2.setText(guest_item_donated.getItemTwo());
            t6_item3.setText(guest_item_donated.getItemTHREE());

        return convertView;
    }

    @Override
    public int getCount() {
        return this.arrayList.size();
    }
}
