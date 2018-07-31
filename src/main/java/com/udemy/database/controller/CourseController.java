package com.udemy.database.controller;

import com.udemy.database.model.Course;

import com.udemy.database.rest.repo.CourseRestRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {


    private final CourseRestRepostory courseRestRepostory;

    public CourseController(CourseRestRepostory courseRestRepostory) {
        this.courseRestRepostory = courseRestRepostory;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/myCourses")
    public List<Course> getCourses() {

        List<Course> courseList = new ArrayList<>();
        courseRestRepostory.findAll().forEach(courseList::add);
        return courseList;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/myCourses/rest")
    public ResponseEntity getCoursesListRest() {

        List<Course> courseList = new ArrayList<>();
        courseRestRepostory.findAll().forEach(courseList::add);
        return new ResponseEntity<>(courseList, HttpStatus.OK);
    }

}
