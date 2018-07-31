package com.udemy.database.model.projection;

public interface CourseProjection {

    Long getId();

    String getCourseName();

    String getLecturerName();

    int getNumberOfStudents();

    Boolean getIsFull();
}
