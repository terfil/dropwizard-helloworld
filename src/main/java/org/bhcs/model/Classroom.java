package org.bhcs.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "classroom")
public class Classroom {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "function")
    private String function;

    @Column(name = "description")
    private String description;

    @Column(name = "createAt")
    private Date createAt;

    @Column(name = "modifiedAt")
    private Timestamp modifiedAt;

    @Column(name = "modifiedBy")
    private String modifiedBy;

    public Classroom(){}
    public Classroom(String name, Integer capacity, String function, String description, Date createAt, Timestamp modifiedAt, String modifiedBy) {
        this.name = name;
        this.capacity = capacity;
        this.function = function;
        this.description = description;
        this.createAt = createAt;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classroom)) return false;
        Classroom classroom = (Classroom) o;
        return id == classroom.id &&
                Objects.equals(getName(), classroom.getName()) &&
                Objects.equals(getCapacity(), classroom.getCapacity()) &&
                Objects.equals(getFunction(), classroom.getFunction()) &&
                Objects.equals(getDescription(), classroom.getDescription()) &&
                Objects.equals(getCreateAt(), classroom.getCreateAt()) &&
                Objects.equals(getModifiedAt(), classroom.getModifiedAt()) &&
                Objects.equals(getModifiedBy(), classroom.getModifiedBy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getName(), getCapacity(), getFunction(), getDescription(), getCreateAt(), getModifiedAt(), getModifiedBy());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
