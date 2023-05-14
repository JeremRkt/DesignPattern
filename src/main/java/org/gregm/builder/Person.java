package org.gregm.builder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private double size;
    private String title;
    private Date birthday;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", title='" + title + '\'' +
                ", birthday=" + birthday +
                '}';
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
