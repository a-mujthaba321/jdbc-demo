package com.udemy.database.rest.repo;

import com.udemy.database.model.Course;
import com.udemy.database.model.projection.CourseProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(excerptProjection = CourseProjection.class)
public interface CourseRestRepostory extends PagingAndSortingRepository<Course, Long> {


}
