package com.ferreira.hallefy.list_view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by HallefyPC on 07/11/2016.
 */

public class FeedListRowHolder extends RecyclerView.ViewHolder {

    protected TextView eventName, eventDate;
    protected ImageView iconeCard;
    Context context;


    int posicao;

    public int getPosicao() {
        return posicao;
    }

    public FeedListRowHolder(View view, final Context context) {
        super(view);
        this.context = context;
        this.eventName = (TextView) view.findViewById(R.id.EventName);
        this.eventDate = (TextView) view.findViewById(R.id.EventDate);


    }
}
   

