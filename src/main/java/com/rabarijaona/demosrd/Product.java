package com.rabarijaona.demosrd;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Product {
    String id;
    String name;
    Price price;

    public Product(String id, String name, Price price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
