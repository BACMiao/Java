package com.hibernate.model;

import javax.persistence.*;

/**
 * Created by King on 2016/2/19.
 */
@Entity
public class Score {
    private int id;
    private int score;
    private Classmate classmate;
    private Course course;
    @ManyToOne
    @JoinColumn(name = "classmate_id")
    public Classmate getClassmate() {
        return classmate;
    }

    public void setClassmate(Classmate classmate) {
        this.classmate = classmate;
    }
    @ManyToOne
    @JoinColumn(name = "course_id")
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
