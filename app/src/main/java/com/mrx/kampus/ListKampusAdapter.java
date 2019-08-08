package com.mrx.kampus;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKampusAdapter extends RecyclerView.Adapter<ListKampusAdapter.ListViewHolder> {
    private ArrayList<Kampus> listKampus;
    public ListKampusAdapter(ArrayList<Kampus> list) {
        this.listKampus = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_kampus, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Kampus kampus = listKampus.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kampus.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(kampus.getName());
        holder.tvFrom.setText(kampus.getDetail());

        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent gotodetail=new Intent(v.getContext(),DetailActivity.class);
                //v.getContext().startActivity(gotodetail);
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listKampus.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent gotodetail=new Intent(v.getContext(),DetailActivity.class);
                gotodetail.putExtra("foto", kampus.getPhoto());
                gotodetail.putExtra("name", kampus.getName());
                gotodetail.putExtra("detail", kampus.getDetail());
                gotodetail.putExtra("category", kampus.getCategory());
                v.getContext().startActivity(gotodetail);
            }
        });

        holder.tv_item_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent gotodetail=new Intent(v.getContext(),DetailActivity.class);
                //v.getContext().startActivity(gotodetail);
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listKampus.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent gotodetail=new Intent(v.getContext(),DetailActivity.class);
                gotodetail.putExtra("foto", kampus.getPhoto());
                gotodetail.putExtra("name", kampus.getName());
                gotodetail.putExtra("detail", kampus.getDetail());
                gotodetail.putExtra("category", kampus.getCategory());
                v.getContext().startActivity(gotodetail);
            }
        });

        holder.tvFrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent gotodetail=new Intent(v.getContext(),DetailActivity.class);
                //v.getContext().startActivity(gotodetail);
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listKampus.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent gotodetail=new Intent(v.getContext(),DetailActivity.class);
                gotodetail.putExtra("foto", kampus.getPhoto());
                gotodetail.putExtra("name", kampus.getName());
                gotodetail.putExtra("detail", kampus.getDetail());
                gotodetail.putExtra("category", kampus.getCategory());
                v.getContext().startActivity(gotodetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKampus.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom ,tv_item_name;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_detail);
            tv_item_name = itemView.findViewById(R.id.tv_item_name );
        }
    }
}
