package com.example.bianca.flowers.model;

/**
 * Created by Bianca on 24.03.2018.
 */

public class Flower {

    private int mId;
    private String mDescription;
    private int mPrice;
    private String mDeliverTo;

    public Flower(int mId, String mDescription, int mPrice, String mDeliverTo) {
        this.mId = mId;
        this.mDescription = mDescription;
        this.mPrice = mPrice;
        this.mDeliverTo = mDeliverTo;
    }

    public int getId() {
        return mId;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getPrice() {
        return mPrice;
    }

    public void setPrice(int mPrice) {
        this.mPrice = mPrice;
    }

    public String getDeliverTo() {
        return mDeliverTo;
    }

    public void setDeliverTo(String mDeliverTo) {
        this.mDeliverTo = mDeliverTo;
    }

}
