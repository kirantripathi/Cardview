package com.example.kiran.cardview;

/**
 * Created by kiran on 2/3/18.
 */

public class product {

    //variable to show data about our description like in list_layout

    private int id;
    private String title, short_desc;
    private double rating;
    private double price;
    private int image; // image is int because we will use image of drawable and that will have an id so..


    //creating constructor

    public product(int id, String title, String short_desc, double rating, double price, int image) {
        this.id = id;//this represent class ..i.e this.id means class id and another id means variable id

        this.title = title;
        this.short_desc = short_desc;
        this.rating = rating;
        this.price = price;
        this.image = image;
    }

//getters to get all the value
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShort_desc() {
        return short_desc;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }


}
