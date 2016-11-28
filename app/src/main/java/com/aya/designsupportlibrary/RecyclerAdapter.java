package com.aya.designsupportlibrary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Recycler View Adapter.
 * Created by aya on 2016/11/28.
 */
public class RecyclerAdapter extends RecyclerView.Adapter {

    private final Context context;
    private List<String> itemList = new ArrayList<>();

    RecyclerAdapter (final Context context, final List<String> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_coodinator_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final TextView textItem = (TextView) holder.itemView.findViewById(R.id.item);
        textItem.setText(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        private ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item);
        }
    }
}
