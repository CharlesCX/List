package com.charles.list.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by charles on 15/03/2018.
 */

public class OfferModel implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("terms")
    @Expose
    private String terms;
    @SerializedName("current_value")
    @Expose
    private String currentValue;
    public final static Parcelable.Creator<OfferModel> CREATOR = new Creator<OfferModel>() {


        @SuppressWarnings({"unchecked"})
        public OfferModel createFromParcel(Parcel in) {
            return new OfferModel(in);
        }

        public OfferModel[] newArray(int size) {
            return (new OfferModel[size]);
        }

    }
            ;

    protected OfferModel(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.terms = ((String) in.readValue((String.class.getClassLoader())));
        this.currentValue = ((String) in.readValue((String.class.getClassLoader())));
    }

    public OfferModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(url);
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeValue(terms);
        dest.writeValue(currentValue);
    }

    public int describeContents() {
        return 0;
    }

}
