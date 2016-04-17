package com.hibernate.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by King on 2016/2/19.
 */
@Entity
public class Classmate {
    private int id;
    private String name;
    private Set<Course> courses = new HashSet<Course>();

    @ManyToMany
    @JoinTable(name = "score",
            joinColumns = @JoinColumn(name = "classmate_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
