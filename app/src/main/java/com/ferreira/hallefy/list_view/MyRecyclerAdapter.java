package com.ferreira.hallefy.list_view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by HallefyPC on 07/11/2016.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<FeedListRowHolder> {
    private List<FeedItem> feedItemList;
    private Context mContext;


    public MyRecyclerAdapter(Context context, List<FeedItem> feedItemList) {
        this.feedItemList = feedItemList;
        this.mContext = context;

    }


    @Override
    public FeedListRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        /*View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, null);
        FeedListRowHolder viewHolder = new FeedListRowHolder(mContext,view);
        return viewHolder;*/
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, null);

        return new FeedListRowHolder(v, mContext);

    }


    @Override
    public void onBindViewHolder(final FeedListRowHolder feedListRowHolder, final int i) {


        final FeedItem feedItem = feedItemList.get(i);
        //Setting text view title

        feedListRowHolder.eventDate.setText("teste");
        feedListRowHolder.eventName.setText("teste");

    }


    @Override
    public int getItemCount() {
        //executa quando desliza até ultima e primeira posição
        //fazer função para atualizar itens aqui...
        return feedItemList.size();

    }
}