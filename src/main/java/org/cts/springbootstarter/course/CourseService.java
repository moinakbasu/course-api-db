package org.cts.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	protected List<Course> getAllCourses(String id) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courses::add);
		return courses;
	}

	protected Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	protected void addCourse(Course course) {
		courseRepository.save(course);
	}

	protected void updateCourse(Course course) {
		courseRepository.save(course);
	}

	protected void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
