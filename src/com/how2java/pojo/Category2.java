package com.how2java.pojo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category2")
public class Category2 {
    private int id;
    private String name;
    private Set<Product2> products;


    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "cid")
    public Set<Product2> getProducts() {
        return products;
    }

    public void setProducts(Set<Product2> products) {
        this.products = products;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category2{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}
