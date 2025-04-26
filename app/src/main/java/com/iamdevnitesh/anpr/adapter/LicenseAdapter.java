package com.iamdevnitesh.anpr.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iamdevnitesh.anpr.R;
import com.iamdevnitesh.anpr.dataclass.License;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LicenseAdapter extends RecyclerView.Adapter<LicenseAdapter.MyViewHolder> {

    Context context;
    ArrayList<License> list;

    public LicenseAdapter(Context context, ArrayList<License> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_holder, parent, false);
        return new MyViewHolder(view);
    }

    @SuppressLint({"ResourceType", "SetTextI18n"})
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // license position
        License license = list.get(position);

        // SETTING UP VALUES
        holder.license.setText("license :" + license.getLicense_plate());
        // unix time to date in dd-mm-yyyy hh:mm:ss format
        Long unixDate = license.getDate();
        Date date1 = new java.util.Date(unixDate* 1000L);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT+5:30"));
        String formattedDate = sdf.format(date1);
        holder.date.setText("date :" + formattedDate);
        //Using Glide to load image from firebase
        String url = license.getImg_Url();
        Picasso.get().load(url).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView license, date;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            license = itemView.findViewById(R.id.licenseTextView);
            date = itemView.findViewById(R.id.dateTextView);
            image = itemView.findViewById(R.id.licenseImageView);
        }
    }
}
