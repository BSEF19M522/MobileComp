package com.example.customizedlistview;

public class Appsclass {
int images;
 String Names;
 String des;

    public Appsclass(int images, String names, String des) {
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

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
