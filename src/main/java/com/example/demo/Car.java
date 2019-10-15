package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=3, max=30)
    private String makeName;

    @NotNull
    @Size(min=3, max=30)
    private String modelName;

    @NotNull
    @Size(min=3, max=30)
    private String modelYear;

    public Car(@NotNull @Size(min = 3, max = 30) String makeName, @NotNull @Size(min = 3, max = 30) String modelName, @NotNull @Size(min = 3, max = 30) String modelYear) {
        this.makeName = makeName;
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    public Car() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }
}

