package com.charles.list.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.charles.list.R;
import com.charles.list.models.OfferModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by charles on 15/03/2018.
 */

public class OfferViewAdapter extends RecyclerView.Adapter<OfferViewAdapter.OfferViewHolder> {

    private List<OfferModel> offerList;
    //private Context context;


    public OfferViewAdapter(List<OfferModel> offerList, Context context) {
        this.offerList = offerList;
        //this.context = context;
    }


    @Override
    public OfferViewAdapter.OfferViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.offer_row, parent, false);
        return new OfferViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OfferViewAdapter.OfferViewHolder holder, int position) {
        holder.offerName.setText(offerList.get(position).getName());
        holder.offerValue.setText(offerList.get(position).getCurrentValue());

    }

    @Override
    public int getItemCount() {
        return offerList.size();
    }

    public static class OfferViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.offer_name)
        TextView offerName;

        @BindView(R.id.offer_current_value)
        TextView offerValue;

        View offerView;

        public OfferViewHolder(View offerView) {
            super(offerView);
            ButterKnife.bind(this, offerView);
            this.offerView = offerView;
        }
    }
}
