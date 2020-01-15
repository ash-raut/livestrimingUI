package com.example.livestrimingui;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class livestreamListAdapter extends RecyclerView.Adapter<livestreamListAdapter.ViewHolder> {
    View listItem;
    private livestreamListData[] listdata;

    public livestreamListAdapter(livestreamListData[] listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public livestreamListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        listItem = layoutInflater.inflate(R.layout.livestream_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final livestreamListAdapter.ViewHolder holder, int position) {
        final livestreamListData myListData = listdata[position];
        holder.ArtistName.setText(listdata[position].getArtistName());
        holder.ArtistAddress.setText(listdata[position].getArtistaddress());
        holder.ArtistDatetime.setText(listdata[position].getArtistDatetime());
        holder.imageView.setImageResource(listdata[position].getImgId());
        /*holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(v.getContext(), BookingFormActivity.class);
                v.getContext().startActivity(intent);

            }
        });*/
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView ArtistName, ArtistAddress,ArtistDatetime;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.linearLayout = (LinearLayout)itemView.findViewById(R.id.linearLayout);
            this.imageView = (ImageView) itemView.findViewById(R.id.imglive);
            this.ArtistName = (TextView) itemView.findViewById(R.id.artistname);
            this.ArtistAddress=(TextView) itemView.findViewById(R.id.artistaddress);
            this.ArtistDatetime = (TextView) itemView.findViewById(R.id.artistdatetime);
        }
    }
}
