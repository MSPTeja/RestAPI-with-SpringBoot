package com.Springrest.Springrest.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class Course {
    @Id
    @Column  (name = "id")
    private  long id;
    @Column (name = "title")
    private String title;
    @Column(name = "description")
    private String Description;

    public Course(long id, String title, String description) {
        this.id = id;
        this.title = title;
        Description = description;
    }
    public Course()
    {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
