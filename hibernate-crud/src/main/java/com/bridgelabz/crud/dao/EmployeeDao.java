package com.bridgelabz.crud.dao;

import java.util.List;

import com.bridgelabz.crud.model.Employee;

/**
 * we are creating intrface of an emp class
 * @author admin
 *
 */
public interface EmployeeDao {
List<Employee> get(); //here we re using collection
Employee get(int id);
void save(Employee employee);
void delete(int id);
}
