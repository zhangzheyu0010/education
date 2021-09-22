package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private Integer id;
    private String name;
    private String courseImg;
    private Integer courseType;
    private String brief;
    private String level;
    private Date pubDate;
    private Integer period;
    private Integer status;
    private Integer students;
    private Integer lessons;
    private Integer pubLessons;
    private Double price;
    private Integer courseCategoryId;
    private Integer teacherId;

    public Product() {
    }

    public Product(Integer id, String name, String courseImg, Integer courseType, String brief, String level, Date pubDate, Integer period, Integer status, Integer students, Integer lessons, Integer pubLessons, Double price, Integer courseCategoryId, Integer teacherId) {
        this.id = id;
        this.name = name;
        this.courseImg = courseImg;
        this.courseType = courseType;
        this.brief = brief;
        this.level = level;
        this.pubDate = pubDate;
        this.period = period;
        this.status = status;
        this.students = students;
        this.lessons = lessons;
        this.pubLessons = pubLessons;
        this.price = price;
        this.courseCategoryId = courseCategoryId;
        this.teacherId = teacherId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStudents() {
        return students;
    }

    public void setStudents(Integer students) {
        this.students = students;
    }

    public Integer getLessons() {
        return lessons;
    }

    public void setLessons(Integer lessons) {
        this.lessons = lessons;
    }

    public Integer getPubLessons() {
        return pubLessons;
    }

    public void setPubLessons(Integer pubLessons) {
        this.pubLessons = pubLessons;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCourseCategoryId() {
        return courseCategoryId;
    }

    public void setCourseCategoryId(Integer courseCategoryId) {
        this.courseCategoryId = courseCategoryId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseImg='" + courseImg + '\'' +
                ", courseType=" + courseType +
                ", brief='" + brief + '\'' +
                ", level='" + level + '\'' +
                ", pubDate=" + pubDate +
                ", period=" + period +
                ", status=" + status +
                ", students=" + students +
                ", lessons=" + lessons +
                ", pubLessons=" + pubLessons +
                ", price=" + price +
                ", courseCategoryId=" + courseCategoryId +
                ", teacherId=" + teacherId +
                '}';
    }
}
