package com.bridgelabz.courseapidata.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
/******************************************************************************
 *  Purpose: this interface is repository interface which can give service
 *  		 to use the implementation of CrudRepository this is the class
 *  		 which we are extending in this interface
 *
 *  
 ******************************************************************************/


public interface CourseRepository extends CrudRepository<Course, String>{
	public List<Course> findByTopicId(String topicId);
}
