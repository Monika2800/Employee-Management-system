package com.acn.EmployeeManagementSystem.DAO;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acn.EmployeeManagementSystem.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	List<Employee> findAll();
	
	@SuppressWarnings("unchecked")
	Employee save(Employee employee);
	
	Optional<Employee> findById(Integer empId);
	
	void delete(Employee employee);

}