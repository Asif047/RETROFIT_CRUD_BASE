package com.delaroystudios.retrofitcrud.helper;

/**
 * Created by delaroystudios on 10/5/2016.
 */

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.bumptech.glide.Glide;
import com.delaroystudios.retrofitcrud.R;

public class ListViewAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<String> id;
    private final ArrayList<String> name;
    private final ArrayList<String> age;
    private final ArrayList<String> mobile;
    private final ArrayList<String> email;
    private final ArrayList<String> image;
    LayoutInflater layoutInflater;

    public ListViewAdapter(Context ctx, ArrayList<String> id, ArrayList<String> name, ArrayList<String> age,
                           ArrayList<String> mobile, ArrayList<String> email,ArrayList<String> image) {
        this.context = ctx;
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.email = email;
        this.image = image;

    }

    @Override
    public int getCount() {
        return id.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(final int position, View view, ViewGroup parent) {

        Holder holder = new Holder();
        layoutInflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);

        view = layoutInflater.inflate(R.layout.list_item, null);
        holder.txt_name=(TextView)view.findViewById(R.id.name);
        holder.txt_age=(TextView)view.findViewById(R.id.age);
        holder.txt_mobile=(TextView)view.findViewById(R.id.mobile);
        holder.txt_mail=(TextView)view.findViewById(R.id.mail);
        holder.ImageIV= (ImageView) view.findViewById(R.id.imageImageView);

        holder.txt_name.setText(name.get(position));
        holder.txt_age.setText(age.get(position));
        holder.txt_mobile.setText(mobile.get(position));
        holder.txt_mail.setText(email.get(position));

        Glide.with(context).load("http://asifulhaque047.000webhostapp.com/details/image/"+image.get(position)).into(holder.ImageIV);

        Log.e("image name:",image.get(position));


        return view;
    }

    static class Holder {
        TextView txt_name,txt_age,txt_mobile,txt_mail;
        ImageView ImageIV;
    }
}
