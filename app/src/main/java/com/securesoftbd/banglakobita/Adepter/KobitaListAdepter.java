package com.securesoftbd.banglakobita.Adepter;

import android.content.Context;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.securesoftbd.banglakobita.KobitaDisplay;
import com.securesoftbd.banglakobita.R;

import java.util.List;

public class KobitaListAdepter extends RecyclerView.Adapter<KobitaListAdepter.KobitaViewHolder> {
    List<String> title_list;
    Context context;

    public KobitaListAdepter(List<String> title_list, Context context) {
        this.title_list = title_list;
        this.context = context;
    }

    @NonNull
    @Override
    public KobitaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.design_kobita_list,null);
        return new KobitaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KobitaViewHolder vh, final int i) {

        vh.titile.setText(title_list.get(i));
        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =new Intent(context, KobitaDisplay.class);
                in.putExtra("id",i);
                context.startActivity(in);
            }
        });

    }

    @Override
    public int getItemCount() {
        return  title_list.size();
    }

    public class KobitaViewHolder extends RecyclerView.ViewHolder {
        TextView titile;
        public KobitaViewHolder(@NonNull View itemView) {
            super(itemView);
            titile=itemView.findViewById(R.id.text);
        }
    }
}
