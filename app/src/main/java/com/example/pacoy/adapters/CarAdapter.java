package com.example.pacoy.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pacoy.models.carro;
import com.example.pacoy.popularmovies.R;

import java.util.ArrayList;

/**
 * Created by pacoy on 04/03/2017.
 */
public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        ViewHolder holder = new ViewHolder(view);
        view.setTag(holder);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        carro carro = data.get(position);
        holder.title.setText(carro.getTitle());
        holder.description.setText(carro.getDescription());
        holder.image.setImageResource(carro.getId_image());
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView title;
        private final TextView description;
        private final  ImageView image;


        public ViewHolder(View view){
            super(view);
            title=(TextView)view.findViewById(R.id.titleTextview);
            description=(TextView)view.findViewById(R.id.subtitleTextview);
            image=(ImageView) view.findViewById(R.id.itemViewImage);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    private ArrayList<carro> data;
    private Context context;

    public CarAdapter(Context context,ArrayList<carro> data){
        this.context=context;
        this.data=data;

    }
}
