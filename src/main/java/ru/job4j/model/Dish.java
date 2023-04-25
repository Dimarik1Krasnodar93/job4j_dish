package ru.job4j.model;

import javax.persistence.*;

@Entity
@Table
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
}
