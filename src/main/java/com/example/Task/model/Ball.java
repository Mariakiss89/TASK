package com.example.Task.model;


import com.sun.istack.NotNull;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;

@Entity
@Table(name="ball")
public class Ball {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private int size;

    @NotNull
    private float weight;


    public Ball(){}

    public Ball(int size, float weight) {
        this.size = size;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
