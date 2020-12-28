package org.bhcs.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "chineseName")
    private String chineseName;

    @Column(name = "gender")
    private Character gender;

    @Column(name = "born")
    private Date birthDay;

    @Column(name = "email")
    private String email;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "phone")
    private String phone;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "householdId")
    private Integer householdId;

    @Column(name = "modifiedAt")
    private Timestamp modifiedAt;

    @Column(name = "createdAt")
    private Time createdAt;

    @Column(name = "createdBy")
    private String createdBy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return id == member.id &&
                Objects.equals(getFirstName(), member.getFirstName()) &&
                Objects.equals(getLastName(), member.getLastName()) &&
                Objects.equals(getChineseName(), member.getChineseName()) &&
                Objects.equals(getGender(), member.getGender()) &&
                Objects.equals(getBirthDay(), member.getBirthDay()) &&
                Objects.equals(getEmail(), member.getEmail()) &&
                Objects.equals(getType(), member.getType()) &&
                Objects.equals(getTitle(), member.getTitle()) &&
                Objects.equals(getPhone(), member.getPhone()) &&
                Objects.equals(getActive(), member.getActive()) &&
                Objects.equals(getHouseholdId(), member.getHouseholdId()) &&
                Objects.equals(getModifiedAt(), member.getModifiedAt()) &&
                Objects.equals(getCreatedAt(), member.getCreatedAt()) &&
                Objects.equals(getCreatedBy(), member.getCreatedBy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getFirstName(), getLastName(), getChineseName(), getGender(), getBirthDay(), getEmail(), getType(), getTitle(), getPhone(), getActive(), getHouseholdId(), getModifiedAt(), getCreatedAt(), getCreatedBy());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Member(){}
    public Member(String firstName, String lastName, String chineseName, Character gender, Date birthDay, String email, String type, String title, String phone, Boolean active, Integer householdId, Timestamp modifiedAt, Time createdAt, String createdBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.chineseName = chineseName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.email = email;
        this.type = type;
        this.title = title;
        this.phone = phone;
        this.active = active;
        this.householdId = householdId;
        this.modifiedAt = modifiedAt;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }
}
