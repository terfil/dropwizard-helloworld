package org.bhcs.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "timeslot")
public class Timeslot {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "start")
    private String start;

    @Column(name = "end")
    private String end;

    @Column(name = "createAt")
    private Date createAt;

    @Column(name = "modifiedAt")
    private Timestamp modifiedAt;

    @Column(name = "modifiedBy")
    private String modifiedBy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Timeslot)) return false;
        Timeslot timeslot = (Timeslot) o;
        return id == timeslot.id &&
                Objects.equals(getStart(), timeslot.getStart()) &&
                Objects.equals(getEnd(), timeslot.getEnd()) &&
                Objects.equals(getCreateAt(), timeslot.getCreateAt()) &&
                Objects.equals(getModifiedAt(), timeslot.getModifiedAt()) &&
                Objects.equals(getModifiedBy(), timeslot.getModifiedBy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getStart(), getEnd(), getCreateAt(), getModifiedAt(), getModifiedBy());
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
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

    public Timeslot(){}
    public Timeslot(String start, String end, Date createAt, Timestamp modifiedAt, String modifiedBy) {
        this.start = start;
        this.end = end;
        this.createAt = createAt;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
    }
}
