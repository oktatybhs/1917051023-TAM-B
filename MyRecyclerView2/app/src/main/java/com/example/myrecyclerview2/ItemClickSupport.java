package com.example.myrecyclerview2;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

import androidx.recyclerview.widget.RecyclerView;

public class ItemClickSupport {


    public abstract class OnItemClickListener implements AdapterView.OnItemClickListener {
        public abstract void onItemClicked(RecyclerView recyclerView, int position, View v);
    }
}
