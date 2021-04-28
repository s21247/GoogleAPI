package com.example.demo.Enitity;


import javax.persistence.*;

@Entity
@Table(name = "Movie")
public class MovieEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String Title;

    private int price;

    public MovieEntity(String title, int price) {
        Title = title;
        this.price = price;
    }

    public MovieEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
