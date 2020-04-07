package com.bridgelabz.crud;
import org.springframework.data.jpa.repository.JpaRepository;
/* *  Purpose: this interface is repository interface which can give service
 *  		 to use the implementation of JpaRepository this is the class
 *  		 which we are extending in this interface
 *
 **/

public interface ProductRepository extends JpaRepository<Product, Long> {

}
