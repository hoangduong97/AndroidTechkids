package com.example.asusa42f.hwbasicwidget;

import java.io.Serializable;

/**
 * Created by AsusA42F on 4/6/2016.
 */
public class Student implements Serializable {
    private String name;
    private String classes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
