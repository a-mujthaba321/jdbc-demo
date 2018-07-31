package com.udemy.database;

import com.udemy.database.controller.CourseController;
import com.udemy.database.model.Course;
import com.udemy.database.rest.repo.CourseRestRepostory;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.results.ResultMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

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
    public void testMockMvc() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(courseController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/myCourses/rest"))
                .andExpect(MockMvcResultMatchers.status().isOk());
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
        Mockito.verify(courseRestRepostory, Mockito.times(1)).findAll();
    }
}