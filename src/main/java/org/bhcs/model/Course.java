package org.bhcs.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "textbook")
    private String textbook;

    @Column(name = "textbookFee")
    private Double textbookFee;

    @Column(name = "description")
    private String description;

    @Column(name = "minAge")
    private Integer minAge;

    @Column(name = "modifiedAt")
    private Timestamp modifiedAt;

    public Course(String name, String textbook, double textbookFee, String description, int minAge, Timestamp modifiedAt) {
        this.name = name;
        this.textbook = textbook;
        this.textbookFee = textbookFee;
        this.description = description;
        this.minAge = minAge;
        this.modifiedAt = modifiedAt;
    }

    public Course() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return id == course.id &&
                Double.compare(course.getTextbookFee(), getTextbookFee()) == 0 &&
                getMinAge() == course.getMinAge() &&
                Objects.equals(getName(), course.getName()) &&
                Objects.equals(getTextbook(), course.getTextbook()) &&
                Objects.equals(getDescription(), course.getDescription()) &&
                Objects.equals(getModifiedAt(), course.getModifiedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getName(), getTextbook(), getTextbookFee(), getDescription(), getMinAge(), getModifiedAt());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextbook() {
        return textbook;
    }

    public void setTextbook(String textbook) {
        this.textbook = textbook;
    }

    public Double getTextbookFee() {
        return textbookFee;
    }

    public void setTextbookFee(Double textbookFee) {
        this.textbookFee = textbookFee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }


}
