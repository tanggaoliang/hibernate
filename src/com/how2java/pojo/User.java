package com.how2java.pojo;

import java.util.Set;

public class User {
    private int id;
    private String name;
    private Set<Product> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public User() {
    }

    public User(int id, String name, Set<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public User(String name, Set<Product> products) {
        this.name = name;
        this.products = products;
    }
}
