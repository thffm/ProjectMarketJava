package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private  List<Product>products = new ArrayList<>();
    private Integer quantity;



    public Carrinho(){

    }

    public Carrinho(List<Product> products, Integer quantity) {
        this.products = products;
        this.quantity = quantity;
    }

    public List<Product> getProducts() {
        return products;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Double totalPrice(){
        double sum = 0;
        for (Product p: products){
            sum += p.getPrice()*getQuantity();
        }
        return  sum;
    }
}
