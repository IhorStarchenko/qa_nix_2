package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car extends BaseEntity {

    private String model;
    private int year;
    private String color;
}
