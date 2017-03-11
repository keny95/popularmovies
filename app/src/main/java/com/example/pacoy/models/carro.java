package com.example.pacoy.models;

/**
 * Created by pacoy on 04/03/2017.
 */

public class carro {
    private int id_image;
    private String title;
    private String description;

    public carro(String description, String title, int id_image) {
        this.description = description;
        this.title = title;
        this.id_image = id_image;
    }

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
