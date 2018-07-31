package com.udemy.database;

import com.udemy.database.controller.CourseController;
import com.udemy.database.model.Course;
import com.udemy.database.rest.repo.CourseRestRepostory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CourseControllerTest {

    @Mock
    CourseRestRepostory courseRestRepostory;

    CourseController courseController;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
        courseController = new CourseController(courseRestRepostory);

    }

    @Test
    public void getCourses() {

        List<Course> testCourses = new ArrayList<>();
        testCourses.add(new Course("My Course"));
        testCourses.add(new Course("My Course II"));
        Mockito.when(courseController.getCourses()).thenReturn(testCourses);


        List<Course> courseList = courseController.getCourses();
        assertEquals(2, courseList.size());
        assertEquals("My Course", courseList.get(0).getCourseName());
    }
}