package models;

import io.ebean.Finder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car extends BaseModel {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    public String type;

    public String path;

    public String  brand;

    public String name;

    public String typecar;

    public int eng;

    public String color;

    public int year;

    public double price;

    public String desc;

    public int vote;

    public static final Finder<Long, Car> find = new Finder<>(Car.class);
}
