package com.in.rumah.rumah_in.model;

import java.io.Serializable;
import java.util.List;

public class HighlightResponse {

    private List<DataHighlight> data;

    public List<DataHighlight> getData() {
        return data;
    }

    public class DataHighlight implements Serializable{

        //TODO :: masih banyak yang belum di inisialisasi
        private String name;
        private String description;
        private String latitude;
        private String longitude;
        private String address;
        private String image_url;

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getLatitude() {
            return latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public String getAddress() {
            return address;
        }

        public String getImage_url() {
            return image_url;
        }
    }
}
