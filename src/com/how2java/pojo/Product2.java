package com.how2java.pojo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Product2")
public class Product2 {
    private int id;
    private String name;
    private float price;
    private Category2 category;
    private Set<User2> users;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_product2",
            joinColumns = @JoinColumn(name = "pid"),
            inverseJoinColumns = @JoinColumn(name = "uid")
    )
    public Set<User2> getUsers() {
        return users;
    }


    public void setUsers(Set<User2> users) {
        this.users = users;
    }


    @Override
    public String toString() {
        return "Product2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    @ManyToOne(targetEntity = Category2.class)
    @JoinColumn(name = "cid")
    public Category2 getCategory() {
        return category;
    }

    public void setCategory(Category2 category) {
        this.category = category;
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

    @Column(name = "price")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
