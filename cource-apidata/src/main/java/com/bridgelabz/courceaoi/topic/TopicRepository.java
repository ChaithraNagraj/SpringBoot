package com.bridgelabz.courceaoi.topic;

import org.springframework.data.repository.CrudRepository;
/******************************************************************************
 *  Purpose: this interface is repository interface which can give service
 *  		 to use the implementation of CrudRepository this is the class
 *  		 which we are extending in this interface
 *
 *  @author  chaithra
 ******************************************************************************/

public interface TopicRepository extends CrudRepository<Topic, String>{

}
