package com.in.rumah.rumah_in.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class BannerResponse {

    private List<DataBanner> data;

    public List<DataBanner> getData() {
        return data;
    }

    public class DataBanner implements Serializable{
        private int id;
        private String image;
        private String caption;
        private String created_at;
        private String updated_at;
        private String image_url;

        public int getId() {
            return id;
        }

        public String getImage() {
            return image;
        }

        public String getCaption() {
            return caption;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public String getImage_url() {
            return image_url;
        }
    }
}
