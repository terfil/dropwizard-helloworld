package org.bhcs.model;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "bhclass")
public class CourseSummary {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "timeslotId")
    @NotFound(action = NotFoundAction.IGNORE)
    private Timeslot timeslot;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "teacherId")
    @NotFound(action = NotFoundAction.IGNORE)
    private Member teacher;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "classroomId")
    @NotFound(action = NotFoundAction.IGNORE)
    private Classroom classroom;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "courseId")
    @NotFound(action = NotFoundAction.IGNORE)
    private Course course;

    @Column(name="fee")
    private Double fee;

    @Column(name="semester")
    private String semester;

    @Column(name="createdAt")
    private Date createdAt;

    @Column(name="modifiedAt")
    private Timestamp modifiedAt;

    @Column(name="modifiedBy")
    private String modifiedBy;

    @Column(name="deleted")
    private Boolean deleted;

    public CourseSummary(){}

    public CourseSummary(Timeslot timeslot, Member teacher, Classroom classroom, Course course, Double fee, String semester, Date createdAt, Timestamp modifiedAt, String modifiedBy, Boolean deleted) {
        this.timeslot = timeslot;
        this.teacher = teacher;
        this.classroom = classroom;
        this.course = course;
        this.fee = fee;
        this.semester = semester;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseSummary)) return false;
        CourseSummary that = (CourseSummary) o;
        return id == that.id &&
                Objects.equals(getTimeslot(), that.getTimeslot()) &&
                Objects.equals(getTeacher(), that.getTeacher()) &&
                Objects.equals(getClassroom(), that.getClassroom()) &&
                Objects.equals(getCourse(), that.getCourse()) &&
                Objects.equals(getFee(), that.getFee()) &&
                Objects.equals(getSemester(), that.getSemester()) &&
                Objects.equals(getCreatedAt(), that.getCreatedAt()) &&
                Objects.equals(getModifiedAt(), that.getModifiedAt()) &&
                Objects.equals(getModifiedBy(), that.getModifiedBy()) &&
                Objects.equals(getDeleted(), that.getDeleted());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getTimeslot(), getTeacher(), getClassroom(), getCourse(), getFee(), getSemester(), getCreatedAt(), getModifiedAt(), getModifiedBy(), getDeleted());
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    public Member getTeacher() {
        return teacher;
    }

    public void setTeacher(Member teacher) {
        this.teacher = teacher;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
