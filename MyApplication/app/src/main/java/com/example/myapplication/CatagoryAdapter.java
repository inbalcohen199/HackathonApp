package com.example.myapplication;

import android.widget.ArrayAdapter;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
public class CatagoryAdapter extends ArrayAdapter<Catagory> {
    private Context context;
    private ArrayList<Catagory> list;
    public CatagoryAdapter(Context context, ArrayList<Catagory> resource)
    {
        super(context , R.layout.catagory_row , resource);
        this.context=context;
        this.list=resource;
    }


}
