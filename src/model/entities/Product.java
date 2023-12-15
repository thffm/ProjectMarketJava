package model.entities;

import java.util.Date;

public class Product {
    private String name;
    private Date data;
    private Double price;


    public Product(){

    }

    public Product(String name, Date data, Double price) {
        this.name = name;
        this.data = data;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getData() {
        return data;
    }



    public Double getPrice() {
        return price;
    }



}
