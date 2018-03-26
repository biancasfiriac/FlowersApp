package com.example.bianca.flowers.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bianca.flowers.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bianca on 24.03.2018.
 */

public class FlowersAdapter extends RecyclerView.Adapter<FlowersAdapter.ViewHolder> {

    private List<Flower> mItems;
    private FlowersAdapterListener mListener;
    private int selectedPosition = 0;

    public FlowersAdapter(@NonNull ArrayList<Flower> flowers, @Nullable FlowersAdapterListener listener) {
        this.mItems = flowers;
        this.mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower_row, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Flower currentFlower = mItems.get(position);

        holder.mFlowerDescription.setText(currentFlower.getDescription());
        holder.mFlowerPrice.setText(currentFlower.getPrice());
        holder.mFlowerDeliverTo.setText(currentFlower.getDeliverTo());
        holder.mFlowerImage.setImageResource(R.drawable.flower_image);

        holder.itemView.setSelected(selectedPosition == position);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @NonNull
    public List<Flower> getItems() {
        return mItems;
    }

    public void setItems(List<Flower> mItems) {
        this.mItems = mItems;
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mFlowerDescription;
        private TextView mFlowerPrice;
        private TextView mFlowerDeliverTo;
        private ImageView mFlowerImage;

        public ViewHolder(View itemView) {
            super(itemView);

            mFlowerDescription = itemView.findViewById(R.id.flower_description);
            mFlowerPrice = itemView.findViewById(R.id.flower_price);
            mFlowerDeliverTo = itemView.findViewById(R.id.flower_deliver_to);
            mFlowerImage = itemView.findViewById(R.id.flower_image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mListener != null) {
                        mListener.onFlowerSelected(getAdapterPosition());
                        selectedPosition = getLayoutPosition();
                        notifyDataSetChanged();
                    }
                }

            });
        }
    }
}
