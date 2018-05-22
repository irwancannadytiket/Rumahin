package com.in.rumah.rumah_in.model;

public class ProductMenu {


    public static final int CARI_RUMAH = 1;
    public static final int INFO_KPR = 2;
    public static final int FIVE_STEP = 3;
    public static final int ISI_FORM = 4;

    private String titleResource;
    private int type;
    private int drawableResource;

    public ProductMenu(String titleResource, int type, int drawableResource) {
        this.titleResource = titleResource;
        this.type = type;
        this.drawableResource = drawableResource;
    }

    public int getType() {
        return type;
    }

    public String getTitleResource() {
        return titleResource;
    }

    public int getDrawableResource() {
        return drawableResource;
    }
}
