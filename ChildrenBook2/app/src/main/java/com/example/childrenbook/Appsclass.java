package com.example.childrenbook;

public class Appsclass {
    int images;
    java.lang.String Names;
    java.lang.String des;

    public Appsclass(int images, java.lang.String names, java.lang.String des) {
        this.images = images;
        Names = names;
        this.des = des;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public java.lang.String getNames() {
        return Names;
    }

    public void setNames(java.lang.String names) {
        Names = names;
    }

    public java.lang.String getDes() {
        return des;
    }

    public void setDes(java.lang.String des) {
        this.des = des;
    }
}
